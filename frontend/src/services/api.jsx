import axios from 'axios';

const api = axios.create({
  baseURL: 'localhost:8080/api/profissionais',
});

export default api;
