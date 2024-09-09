import React, { useContext } from 'react';
import { AppContext } from '../context/AppContext';
import './Spinner.css';
import Spinner from './Spinner';

function Blogs() {
  // consumecontext
  const { posts, loading } = useContext(AppContext);
  // console.log('priniting data');
  // console.log(posts);
  return (
    <div className="w-11/12 max-w-[650px] py-4 flex flex-col gap-y-7 mt-[68px] mb-[70px]">
      {loading ? (
        <Spinner />
      ) : posts?.length === 0 ? (
        <div>
          <p>No Posts Found</p>
        </div>
      ) : (
        posts.map((post) => (
          <div key={post.id}>
            <p className="font-bold text-xl">{post.title}</p>
            <p className="text-[15px] ">
              by <span className="italic">{post.author}</span> on{' '}
              <span className="underline bold">{post.category}</span>
            </p>
            <p className="text-[14px] mt-[2px]">Posted on {post.date}</p>
            <p className="text-md mt-[7px]">{post.content}</p>
            <div className="flex gap-x-3">
              {post.tags.map((tag, index) => {
                return (
                  <span
                    className="text-blue-500 underline font-bold text-[12px] mt-[5px]"
                    key={index}
                  >{`#${tag}`}</span>
                );
              })}
            </div>
          </div>
        ))
      )}
    </div>
  );
}

export default Blogs;
