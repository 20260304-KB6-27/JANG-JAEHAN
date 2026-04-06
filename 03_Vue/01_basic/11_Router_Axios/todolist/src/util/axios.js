import axios from 'axios';

// axios.create로 axios 객체 생성
const instance = axios.create({
  baseURL: '/api',
});

export default instance;
