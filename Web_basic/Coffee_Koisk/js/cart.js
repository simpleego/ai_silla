const btnAmericano = document.querySelector("#btnAmericano")
const btnLatte = document.querySelector("#btnLatte")
const btnMoka = document.querySelector("#btnMoka")

// 주문버튼 상태 관리
btnAmericanoClicked = false;
btnLatteClicked = false;
btnMokaClicked = false;

orders = {
    "아메리카노": { "amount": 1, "price": 0, "total_price": 0 },
    "라떼": { "amount": 1, "price": 0, "total_price": 0 },
    "모카": { "amount": 1, "price": 0, "total_price": 0 },
};

coffee_id = { "아메리카노": "americano", "라떼": "latte", "모카": "moka" };

const MAX_ORDER = 10;

btnAmericano.addEventListener('click', function (e) {
    orderPreProcess(e);
    if (!btnAmericanoClicked) {
        orderAmericano(e, menu, price)
        btnAmericanoClicked = true;
    } else {
        alert("이미 주문되었습니다 수량조정하세요!!")
    }
});

btnLatte.addEventListener('click', function (e) {
    orderPreProcess(e);
    if (!btnLatteClicked) {
        orderLatte(e, menu, price)
        btnLatteClicked = true;
    } else {
        alert("이미 주문되었습니다 수량조정하세요!!")
    }
});

btnMoka.addEventListener('click', function (e) {
    orderPreProcess(e);
    if (!btnMokaClicked) {
        orderMoka(e, menu, price)
        btnMokaClicked = true;
    } else {
        alert("이미 주문되었습니다 수량조정하세요!!")
    }
});

function orderPreProcess(e) {
    menu = e.target.parentElement.querySelector(".coffeeName").innerHTML;
    price = e.target.parentElement.querySelector(".price").innerHTML;
    price = price.replace(',', '');
    price = price.replace('원', '');
    cart = document.querySelector("#cart")
    cart.style.display = "block"
}

function orderAmericano(e, menu, price) {
    console.log(menu, price)

    cancel = "cancel_" + coffee_id[menu]
    amount = orders[menu]["amount"]
    orders[menu]["price"] = price
    total_price = amount * price

    item = `
    <span id="menu">${menu}</span>(<span id="price">${price}</span>원)
                수량 : <button id="up" on>+</button>
                <span id="amount">${amount}</span>
                <button id="down">-</button>
                금액 : <input type="text" id="total_price" value="${total_price}" readonly>
                <button id="${cancel}">취소</button>
    `;
    const cartItem = document.querySelector("#cartItem")
    const orderItem = document.createElement("li")
    orderItem.innerHTML = item
    document.getElementById("cartItem").appendChild(orderItem)

    up_button = document.querySelector("#up")
    up_button.addEventListener('click', function (e) {
        // amount 값을 증가
        // 수량은 10개 까지 가능하도록 설정하고 안내해 주세요.
        orders[menu]["amount"]++
        if (orders[menu]["amount"] > MAX_ORDER) {
            orders[menu]["amount"] = MAX_ORDER
            alert('수량은 10개 까지 가능합니다.')
        }
        console.log(this.parentElement.querySelector("#amount").innerHTML)
        this.parentElement.querySelector("#amount").innerHTML =
            orders[menu]["amount"]

        total_price = price * orders[menu]["amount"]
        this.parentElement.querySelector("#total_price").value = total_price
    });

    down_button = document.querySelector("#down")
    down_button.addEventListener('click', function (e) {
        // amount 값을 감소
        if (orders[menu]["amount"] != 1) {
            orders[menu]["amount"]--
        } else {
            alert('수량은 최소 1이상 입니다.')
        }

        this.parentElement.querySelector("#amount").innerHTML = orders[menu]["amount"]

        total_price = price * orders[menu]["amount"]
        this.parentElement.querySelector("#total_price").value = total_price
    });

    total_price = price * amount
    this.parentElement.querySelector("#amount").value = total_price
}

function orderLatte(e, menu, price) {
    console.log(menu, price)

    cancel = "cancel_" + coffee_id[menu]
    amount = orders[menu]["amount"]
    orders[menu]["price"] = price
    total_price = amount * price

    item = `
    <span id="menu">${menu}</span>(<span id="price">${price}</span>원)
                수량 : <button id="latteup" on>+</button>
                <span id="amount">${amount}</span>
                <button id="lattedown">-</button>
                금액 : <input type="text" id="total_price" value="${total_price}" readonly>
                <button id="${cancel}">취소</button>
    `;
    const cartItem = document.querySelector("#cartItem")
    const orderItem = document.createElement("li")
    orderItem.innerHTML = item
    document.getElementById("cartItem").appendChild(orderItem)

    const up_button_latte = document.querySelector("#latteup")
    up_button_latte.addEventListener('click', function (e) {
        // amount 값을 증가
        // 수량은 10개 까지 가능하도록 설정하고 안내해 주세요.
        orders[menu]["amount"]++
        if (orders[menu]["amount"] > MAX_ORDER) {
            orders[menu]["amount"] = MAX_ORDER
            alert('수량은 10개 까지 가능합니다.')
        }
        console.log(this.parentElement.querySelector("#amount").innerHTML)
        this.parentElement.querySelector("#amount").innerHTML =
            orders[menu]["amount"]

        total_price = price * orders[menu]["amount"]
        this.parentElement.querySelector("#total_price").value = total_price
    });

    const down_button_latte = document.querySelector("#lattedown")
    down_button_latte.addEventListener('click', function (e) {
        // amount 값을 감소
        if (orders[menu]["amount"] != 1) {
            orders[menu]["amount"]--
        } else {
            alert('수량은 최소 1이상 입니다.')
        }

        this.parentElement.querySelector("#amount").innerHTML = orders[menu]["amount"]

        total_price = price * orders[menu]["amount"]
        this.parentElement.querySelector("#total_price").value = total_price
    });

    total_price = price * amount
    this.parentElement.querySelector("#amount").value = total_price
}

function orderMoka(e, menu, price) {
    console.log(menu, price)

    cancel = "cancel_" + coffee_id[menu]
    amount = orders[menu]["amount"]
    orders[menu]["price"] = price
    total_price = amount * price

    item = `
    <span id="menu">${menu}</span>(<span id="price">${price}</span>원)
                수량 : <button id="mokaup" on>+</button>
                <span id="amount">${amount}</span>
                <button id="mokadown">-</button>
                금액 : <input type="text" id="total_price" value="${total_price}" readonly>
                <button id="${cancel}">취소</button>
    `;
    const cartItem = document.querySelector("#cartItem")
    const orderItem = document.createElement("li")
    orderItem.innerHTML = item
    document.getElementById("cartItem").appendChild(orderItem)

    const up_button_moka = document.querySelector("#mokaup")
    up_button_moka.addEventListener('click', function (e) {
        // amount 값을 증가
        // 수량은 10개 까지 가능하도록 설정하고 안내해 주세요.
        orders[menu]["amount"]++
        if (orders[menu]["amount"] > MAX_ORDER) {
            orders[menu]["amount"] = MAX_ORDER
            alert('수량은 10개 까지 가능합니다.')
        }
        console.log(this.parentElement.querySelector("#amount").innerHTML)
        this.parentElement.querySelector("#amount").innerHTML =
            orders[menu]["amount"]

        total_price = price * orders[menu]["amount"]
        this.parentElement.querySelector("#total_price").value = total_price
    });

    const down_button_moka = document.querySelector("#mokadown")
    down_button_moka.addEventListener('click', function (e) {
        // amount 값을 감소
        if (orders[menu]["amount"] != 1) {
            orders[menu]["amount"]--
        } else {
            alert('수량은 최소 1이상 입니다.')
        }

        this.parentElement.querySelector("#amount").innerHTML = orders[menu]["amount"]

        total_price = price * orders[menu]["amount"]
        this.parentElement.querySelector("#total_price").value = total_price
    });

    total_price = price * amount
    this.parentElement.querySelector("#amount").value = total_price
}

function commaFormat(x) {
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

function commaRemove(x) {
    return x.replace(/,/g, "");
}

