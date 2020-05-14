import React, { useEffect, useState } from 'react';
import axios from 'axios';
import MainLayout from '../componets/layouts/mainLayout';
import '../styles/main.css';

const Home = (props) => {
  const { user } = props;
  const [stateUser, setStateUser] = useState({});
  useEffect(() => {
    if (typeof user !== 'undefined') {
      setStateUser(user);
    }
  }, [user]);
  return (
    <MainLayout>
      <h1 className='superAwesome'>Welcome to my page</h1>
      {JSON.stringify(stateUser)}
    </MainLayout>
  );
};
export const getServerSideProps = async ({ req, res, query }) => {
  let userData;
  try {
    const response = await axios.get(
      'https://jsonplaceholder.typicode.com/users/1'
    );

    userData = response.data;
  } catch (error) {
    console.log('Error :', error);
  }

  return {
    props: {
      user: userData
    }
  };
};
export default Home;
