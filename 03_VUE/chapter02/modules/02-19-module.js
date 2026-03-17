let base = 100;
const add = (x) => base + x;
const multiply = (x) => base * x;
const getBase = () => base;

export { add, multiply };
export const addPersonal = (x) => base + x;
export const multiplyPersonal = (x) => base * x;
export default getBase;
