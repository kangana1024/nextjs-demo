import React from 'react';
import MainLayout from '../../componets/layouts/mainLayout';
import axios from 'axios';

const Profile = ({ user }) => {
  return (
    <MainLayout>
      <h1>Welcome to my Profile</h1>
    </MainLayout>
  );
};

export const getServerSideProps = async ({ req }) => {
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
export default Profile;
