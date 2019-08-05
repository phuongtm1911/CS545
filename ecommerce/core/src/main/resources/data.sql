delete from user;

delete from item;
delete from order;
delete from payment;
delete from buyer;
delete from address;
delete from product;
delete from category;

INSERT INTO user(id,  email,  password, username) VALUES
(1, 'admin@gmail.com', '$2a$10$p3PHnpoBAnzZiL8mr3gMieMhVVSb585ajC2ZsBB0kwb4KvZKFSdNi', 'admin'),
(2, 'seller@gmail.com', '$2a$10$hKDVYxLefVHV/vtuPhWD3OigtRyOykRLDdUAp80Z1crSoS1lFqaFS', 'seller'),
(3, 'buyer@gmail.com', '$2a$10$/Y0IarSOuH2dz.UOLrZbaus17K6AJF7n15qWr02aWN1MOz5vEKT8y', 'buyer'),
(4, 'phoebe@gmail.com', '$2a$10$UFEPYW7Rx1qZqdHajzOnB.VBR3rvm7OI7uSix4RadfQiNhkZOi2fi', 'phoebe'),
(5, 'user@gmail.com', '$2a$10$ByIUiNaRfBKSV6urZoBBxe4UbJ/sS6u1ZaPORHF9AtNWAuVPVz1by', 'user');

insert into category(id, name, disabled) values
(1,'T-shirt', false),
(2,'Dress', false),
(3,'Shoes', false);

INSERT INTO product(id, category_id, name, description, image_url, price, disabled, createdDate) VALUES
(1,  1, 'Quilling Toy 1', 'Quilling Toy 1', '1.jpg', '430.00', false, now()),
(2,  2, 'Quilling Toy 2', 'Quilling Toy 2', '2.jpg', '490.00', false, now()),
(3,  3, 'Quilling Toy 3', 'Quilling Toy 3', '3.jpg', '400.00', false, now()),
(4,  1, 'Quilling Toy 4', 'Quilling Toy 4', '4.jpg', '430.00', false, now()),
(5,  2, 'Quilling Toy 5', 'Quilling Toy 5', '5.jpg', '750.00', false, now()),
(6,  3, 'Quilling Toy 6', 'Quilling Toy 6', '6.jpg', '350.00', false, now()),
(7, 1, 'Quilling Toy 7', 'Quilling Toy 7', '7.jpg', '220.00', false, now()),
(8, 2, 'Quilling Toy 8', 'Quilling Toy 8', '8.jpg', '120.00', false, now()),
(9, 3, 'Quilling Toy 9', 'Quilling Toy 9', '9.jpg', '150.00', false, now()),
(10, 1, 'Quilling Toy 10', 'Quilling Toy 10', '10.jpg', '460.00', false, now()),
(11, 2, 'Quilling Toy 11', 'Quilling Toy 11', '11.jpg', '440.00', false, now()),
(12, 3, 'Quilling Toy 12', 'Quilling Toy 12', '12.jpg', '450.00', false, now()),
(13, 1, 'Quilling Toy 13', 'Quilling Toy 13', '13.jpg', '470.00', false, now()),
(14, 2, 'Quilling Toy 14', 'Quilling Toy 14', '14.jpg', '250.00', false, now()),
(15, 3, 'Quilling Toy 15', 'Quilling Toy 15', '15.jpg', '450.00', false, now()),
(16, 1, 'Quilling Toy 16', 'Quilling Toy 16', '16.jpg', '150.00', false, now()),
(17, 2, 'Quilling Toy 17', 'Quilling Toy 17', '17.jpg', '450.00', false, now()),
(18, 3, 'Quilling Toy 18', 'Quilling Toy 18', '18.jpg', '450.00', false, now()),
(19,  1, 'Quilling Toy 19', 'Quilling Toy 19', '19.jpg', '400.00', false, now()),
(20,  2, 'Quilling Toy 20', 'Quilling Toy 20', '20.jpg', '450.00', false, now()),
(21,  3, 'Quilling Toy 21', 'Quilling Toy 21', '21.jpg', '450.00', false, now()),
(22,  1, 'Quilling Toy 22', 'Quilling Toy 22', '22.jpg', '550.00', false, now()),
(23,  2, 'Quilling Toy 23', 'Quilling Toy 23', '23.jpg', '450.00', false, now()),
(24,  3, 'Quilling Toy 24', 'Quilling Toy 24', '24.jpg', '450.00', false, now()),
(25,  1, 'Quilling Toy 25', 'Quilling Toy 25', '25.jpg', '250.00', false, now());

INSERT INTO buyer(id, firstname, lastname, phone) VALUES
(1, 'Phoebe', 'Tran', '999999999'),
(2, 'John', 'Doe', '8888888888');

insert into address(id, address_line1, address_line2, city, state, zip_code, country) values
(1, 'Trailer 4B', '2000 N Court St', 'Fairfield', 'IA', '52556', 'US');

insert into payment(id, cardNumber, cvv, amount) values
(1, '1111111111111111', '123', 430.00);

insert into order(id, buyer_id, billingAddress_id, shippingAddress_id, payment_id, status, createdDate) values
(1, 1, 1, 1, 1, 'NEW', now());

insert into item(id, order_id, price, product_id, quantity) values
(1,1, 430.00, 1, 1);