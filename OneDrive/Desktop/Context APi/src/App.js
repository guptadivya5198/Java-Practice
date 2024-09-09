import './App.css';
import Header from './components/Header';
import Blogs from './components/Blogs';
import Pagination from './components/Pagination';
import { useContext, useEffect } from 'react';
import { AppContext } from './context/AppContext';

export default function App() {
  const { fetchBlogPost } = useContext(AppContext);

  useEffect(() => {
    fetchBlogPost();
  }, []);
  return (
    <div className="flex flex-col h-full w-full justify-center items-center gap-y-1">
      <Header />
      <Blogs />
      <Pagination />
    </div>
  );
}
