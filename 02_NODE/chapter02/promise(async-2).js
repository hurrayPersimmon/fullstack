let likePizza = true;
const pizza = new Promise((resolve, reject) => {
  //promise 생성과 동시에 비동기 작업 진행.
  if (likePizza) resolve('피자를 주문합니다.');
  else reject('피자를 주문하지 않습니다.');
});

pizza //promise 생성되었으니 바로 비동기로 작업 진행.
  // 이후 비동기 작업 끝난 뒤 성공하면 then 실패 시 catch
  .then((result) => console.log(result)) //result = '피자를 주문합니다.'
  .then(console.log('피자다!')) // 이처럼 함수를 계속 진행할 수 있음.
  .catch((err) => console.log(err)); //err = '피자를 주문하지 않습니다.'
