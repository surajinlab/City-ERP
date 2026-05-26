import axios from "axios";

const API_URL = "http://localhost:8080/api/attendance";

export const markAttendance = async (attendanceData) => {
  return await axios.post(API_URL, attendanceData);
};

export const getStudentAttendance = async (studentId) => {
  return await axios.get(`${API_URL}/student/${studentId}`);
};