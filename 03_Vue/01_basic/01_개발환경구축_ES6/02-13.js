let obj = { result: 0 };

// JavaScript this 바인딩 문제
obj.add = function (x, y) {
  function inner() {
    // this ?
    this.result = x + y;
  }

  // 일반함수 호출
  // inner 함수의 this는 obj객체가 아닌 전역 객체를 참조
  // 즉, inner 함수의 this는 global(node), window객체
  inner();
};

obj.add(3, 4);
console.log(obj); // { result: 0, add: [Function (anonymous)] }
console.log(result); // 7 : 전역객체의 result값이 출력됨
// console.log(globalThis.result); // 7 : 위 출력값과 같음

// 1. 화살표 함수 : 호출된 상위의 객체의 this
// let obj = { result: 0 };

// obj.add = function (x, y) {
//   // 화살표 함수 안의 this : 상위 scope의 this
//   const inner = () => {
//     this.result = x + y;
//   };

//   inner();
// };

// obj.add(3, 4);
// console.log(obj);
// console.log(obj.result);

// 2. bind()로 명시적 바인딩
// 함수의 this 값을 특정 객체의 영구적으로 바인딩한 새로운 함수를 반환
// 첫 번재 인자로 전달된 객체가 this를 가리킴
// let obj = { result: 0 };
// obj.add = function (x, y) {
//   function inner() {
//     this.result = x + y;
//   }

//   // inner 함수의 this를 obj 객체로 바인딩하여 호출
//   inner.bind(obj)();
// };

// obj.add(3, 4);
// console.log(obj);
// // console.log(obj.result);
