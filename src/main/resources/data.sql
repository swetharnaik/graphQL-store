DROP TABLE IF EXISTS store;

CREATE TABLE store (
  id INT AUTO_INCREMENT PRIMARY KEY,
  store_name VARCHAR(250) NOT NULL,
  store_code INT NOT NULL,
  store_type VARCHAR NOT NULL,
  pincode INT NOT NULL,
  address VARCHAR(500) DEFAULT NULL,
  phone_no INT NOT NULL
);

INSERT INTO store (store_name, store_code, store_type, pincode, address, phone_no) VALUES
  ('More', 459, 'Supermarket', 308320, 'ABC Street, XYZ Town', 4042124),
  ('Apollo', 09, 'Pharmacy', 8222035, 'Burger Street, LMN Town', 8430174),
  ('A2Z', 5677, 'Supermarket', 944903, 'Cat Street, Dog Town', 5094280);


DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id INT AUTO_INCREMENT PRIMARY KEY,
  product_name VARCHAR(250) NOT NULL,
  product_category VARCHAR(100) NOT NULL,
  product_price INT NOT NULL,
  product_desc VARCHAR(500) NOT NULL,
  store_id INT,
  FOREIGN KEY (store_id) REFERENCES store(id)
);

INSERT INTO product (store_id, product_name, product_category, product_price, product_desc) VALUES
  (1, 'Mango', 'Fruit', 100, 'Rich Creamy and Tasty Alphonso Mangos'),
  (2, 'Calpol', 'Aspirin', 50, 'Aspirin for headaches, fever, mild body pain'),
  (1, 'Colgate', 'Toothpaste', 150, 'Toothpaste for Teeth Whitening'),
  (3, 'Lays', 'Chips', 10, 'To beat that craving for potato chips'),
  (3, 'Oreo', 'Biscuit', 50, 'Creamy and Crunchy Biscuit to satisfy your sweet tooth cravings');