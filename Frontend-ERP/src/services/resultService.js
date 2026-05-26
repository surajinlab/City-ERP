import axios from "axios";

const API_URL = "http://localhost:8080/api/results";

export const uploadResult = async (resultData) => {
  return await axios.post(API_URL, resultData);
};

export const getStudentResult = async (studentId) => {
  return await axios.get(`${API_URL}/student/${studentId}`);
};