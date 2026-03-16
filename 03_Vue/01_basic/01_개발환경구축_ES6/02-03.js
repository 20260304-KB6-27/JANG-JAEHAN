// const
// 재할당을 금지

const p1 = { name: 'john', age: 20 };

// 객체 내부 값은 변경 가능. p1은 stack메모리에서 heap메모리의 객체 데이터드르이 주소를 참조.
p1.age = 22;
p1.nick = 'bear';

console.log(p1);

// 새로운 객체를 할당하는 것은 안됨. TypeError 발생
//p1 = { name: 'lee', age: 25 }; // error
