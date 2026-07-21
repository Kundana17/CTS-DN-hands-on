import Cart from "./Cart";

function OnlineShopping() {

    const items = [
        { itemname: "Laptop", price: 65000 },
        { itemname: "Mouse", price: 700 },
        { itemname: "Keyboard", price: 1200 },
        { itemname: "Headphones", price: 2500 },
        { itemname: "Monitor", price: 12000 }
    ];

    return (
        <div>
            <h2>Shopping Cart</h2>

            <table border="1" cellPadding="8">
                <thead>
                <tr>
                    <th>Item Name</th>
                    <th>Price</th>
                </tr>
                </thead>

                <tbody>
                {
                    items.map((item, index) => (
                        <Cart
                            key={index}
                            itemname={item.itemname}
                            price={item.price}
                        />
                    ))
                }
                </tbody>
            </table>
        </div>
    );
}

export default OnlineShopping;