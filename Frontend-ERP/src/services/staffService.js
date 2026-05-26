import axios from "axios";

const API_URL = "http://localhost:8080/api/staff";

export const getAllStaff = async () => {
  return await axios.get(API_URL);
};

export const saveStaff = async (staff) => {
  return await axios.post(API_URL, staff);
};