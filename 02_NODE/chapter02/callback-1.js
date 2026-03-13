function order(coffee, callback) {
  console.log(`${coffee} 주문 접수 완료`);
  setTimeout(() => {
    callback(coffee); //callback
  }, 3000);
}

const display = (result) => {
  console.log(`${result} 완료!`);
};

order('아메리카노', display);
