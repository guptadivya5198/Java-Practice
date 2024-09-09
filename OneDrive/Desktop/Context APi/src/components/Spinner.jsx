import React from 'react';
import './Spinner.css';
const Spinner = () => {
  return (
    <div className="flex justify-center mt-[230px]">
      <div className="spinner"></div>
      <p>Loading..</p>
    </div>
  );
};

export default Spinner;
