import axios from "axios";

const API_URL = "http://localhost:8080/api/fees";

export const submitFee = async (feeData) => {
  return await axios.post(API_URL, feeData);
};

export const getFeeByStudent = async (studentId) => {
  return await axios.get(`${API_URL}/student/${studentId}`);
};