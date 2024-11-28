// 주문상품 리스트
orders = {
  아메리카노: { amount: 1, price: 0, total_price: 0 },
  라떼: { amount: 1, price: 0, total_price: 0 },
  모카: { amount: 1, price: 0, total_price: 0 },
};

// 주문상품 리스트 접근 방법 : orders['아메리카노']['amount']

coffee_index = { 아메리카노: 0, 라떼: 1, 모카: 2 };
coffee_id = { 아메리카노: "americano", 라떼: "latte", 모카: "moka" };

btnAmericanoClicked = false;
btnLatteClicked = false;
btnMokaClicked = false;
let menu = "";
let price = "";

const MAX_ORDER_COUNT = 10;

// 주무 버튼 배열 객체 생성
const btnOrders = document.querySelectorAll(".btnOrder");
console.log('btnOrders->'+btnOrders)

// 커피 메뉴 처리
btnOrders.forEach((element)=> {
  element.addEventListener('click',function(event){
    orderPreProcess(event);

    switch (menu) {
      case "아메리카노":
        if (!btnAmericanoClicked) {
          orderCoffees(event, menu, price);
          btnAmericanoClicked = true;
          element.disabled = 'true';
        }
        break;
      case "라떼":
        if (!btnLatteClicked){
          orderCoffees(event, menu, price);
          btnLatteClicked = true;
          element.disabled = 'true'
        }
        break;
      case "모카":
        if (!btnMokaClicked) {
          orderCoffees(event, menu, price);
          btnMokaClicked = true;
          element.disabled = 'true'
        }
        break;
    }
  });
});

function orderPreProcess(e) {
  menu = e.target.parentElement.querySelector(".name").innerHTML;
  price = e.target.parentElement.querySelector(".price").innerHTML;

  cart = document.querySelector("#cart");
  cart.style.display = "block";

  price = commaRemove(price);
}

// 커피 주문 통합 함수
function orderCoffees(event, menu, price) {
  index = coffee_index[menu];
  orders[menu]["price"] = price;
  amount = orders[menu]["amount"];
  total_price_ = commaFormat(price * amount);
  const cancel = "cancel_" + coffee_id[menu];
  const upButton = coffee_id[menu] + "up";
  const downButton = coffee_id[menu] + "down";

  // 장바구니 상품 태그
  item = `
    <span class="menu">${menu}</span>(<span class="price">${price}</span>원)
        수량 : <button id="${upButton}">+</button>
        <span class="amount">${amount}</span>
        <button id="${downButton}">-</button>
        금액 : <input type="text" class="total_price" 
        value=${total_price_} readonly>
    <button id="${cancel}">취소</button>
`;

  const cartItem = document.querySelector("#cartItem");
  const orderItem = document.createElement("li");
  orderItem.innerHTML = item;
  document.getElementById("cartItem").appendChild(orderItem);

  const up_button = document.querySelector("#" + upButton);
  console.log("up_button", up_button);
  up_button.addEventListener("click", function (e) {
    // amount 값을 증가
    orders[menu]["amount"]++;
    if (orders[menu]["amount"] > MAX_ORDER_COUNT) {
      orders[menu]["amount"] = MAX_ORDER_COUNT;
      e.target.disabled = true;
    }
    this.parentElement.querySelector(".amount").innerHTML =
      orders[menu]["amount"];
    total_price_ = price * orders[menu]["amount"];
    this.parentElement.querySelector(".total_price").value =
      commaFormat(total_price_);
    totalPayment();
  });

  const down_button = document.querySelector("#" + downButton);
  down_button.addEventListener("click", function (e) {
    // 수량값을 감소
    amount = this.parentElement.querySelector(".amount").innerHTML;
    amount--;
    if (amount == 0) {
      amount = 1;
      e.target.disabled = true
    }
    this.parentElement.querySelector(".amount").innerHTML = amount;

    total_price_ = price * amount;
    this.parentElement.querySelector(".total_price").value =
      commaFormat(total_price_);
    totalPayment();
  });
  totalPayment();

  // 주문 삭제 버튼 기능
  const cancelOrderButton = document.querySelector("#" + cancel);
  cancelOrderButton.addEventListener("click", function (event) {
    // 아메리카로 주문 취소
    cancelOrder(event, menu);
  });
}

//  주문 취소 기능
//  1) 해당 주문항목을 목록에서 삭제하는 방법
//  2) 주문수량을 0으로 초기화 하는 방법
function cancelOrder(event, menu) {
  liElement = event.target.parentElement;
  orderListCount = document.getElementById("cartItem").childElementCount;

  if (confirm("주문 취소할까요?")) {
    event.target.parentElement.remove();
    // 주문버튼 기능 초기화
    switch (menu) {
      case "아메리카노":
        btnAmericanoClicked = false;
        activateOrderButton('아메리카노');
        break;
      case "라떼":
        btnLatteClicked = false;
        activateOrderButton('라떼');
        break;
      case "모카":
        btnMokaClicked = false;
        activateOrderButton('모카');
        break;
    }

    if (orderListCount != 1) {
      totalPayment();
      return;
    }

    // 장바구니 지우고, 주문버튼은 활성화
    document.querySelector("#cart").style.display = "none";    
  }
}

function activateOrderButton(coffee){
  const orderButtons = document.querySelectorAll('.btnOrder');
  console.log('--->')
  orderButtons.forEach((element) => {
    console.log('--->'+element)
    elementName = element.parentElement.querySelector('.name').innerHTML;
    if(elementName === coffee){
        element.disabled = false
    }
  });
}

function orderCountUp() {
  const cartItems = document.querySelectorAll(".menu");
  cartItems.forEach((element) => {
    console.log(element);
  });
}

let totalPrice = 0;
function totalPayment() {
  totalPrice = 0;
  const totalPayment = document.querySelectorAll(".total_price");
  totalPayment.forEach((element) => {
    totalPrice += Number(commaRemove(element.value));
  });
  console.log(totalPrice);
  document.querySelector("#totalPayment").innerHTML = commaFormat(totalPrice);
}

function commaFormat(x) {
  return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

function commaRemove(x) {
  return x.replace(/,/g, "");
}

const modal = document.querySelector(".modal");
const btnOpenModal = document.querySelector("#btn_payment");

btnOpenModal.addEventListener("click", (event) => {
  modal.style.display = "flex";

  total_payment = document.querySelector("#totalPayment").innerHTML;
  console.log("total_payment:" + total_payment);

  pay = `<p>결재금액 : <span id="total_pay">${total_payment}</span>원</p>`;

  const modal_body = document.querySelector(".modal_body");
  const payment = document.createElement("div");
  payment.innerHTML = pay;
  modal_body.appendChild(payment);

  const doPay = document.querySelector("#doPay")
  doPay.addEventListener('click', ()=>{
      alert('결재 완료하였습니다.')
      modal.style.display = "none";
  });

  const calcelPay = document.querySelector("#cancelPay")
  calcelPay.addEventListener('click', ()=>{
      alert('결재 취소하였습니다.')
      modal.style.display = "none";
  });

});