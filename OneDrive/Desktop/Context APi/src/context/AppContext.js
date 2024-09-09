import { createContext, useState } from 'react';
import { baseUrl } from '../baseUrl';

//1- Create Context
export const AppContext = createContext();

// create Provider
export default function AppContextProvider({ children }) {
  const [loading, setLoading] = useState(false);
  const [posts, setPost] = useState([]);
  const [page, setPage] = useState(1);
  const [totalPages, setTotalPages] = useState(null);

  // data filling

  async function fetchBlogPost(page = 1) {
    setLoading(true);
    let url = `${baseUrl}?page=${page}`;

    try {
      const result = await fetch(url);
      const data = await result.json();
      // console.log('api data fetch');
      console.log(data);
      setPage(data.page);
      setPost(data.posts);
      setTotalPages(data.totalPages);
    } catch (error) {
      console.log('error in fetching data');
      setPage(1);
      setPost([]);
      setTotalPages(null);
    }
    setLoading(false);
  }

  function handlePageChange(page) {
    setPage(page);
    fetchBlogPost(page);
  }

  const value = {
    loading,
    setLoading,
    posts,
    setPost,
    page,
    setPage,
    totalPages,
    setTotalPages,
    handlePageChange,
    fetchBlogPost,
  };
  // step 2 content Provider
  return <AppContext.Provider value={value}>{children}</AppContext.Provider>;
}
