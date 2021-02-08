DROP TABLE IF EXISTS product;
CREATE TABLE IF NOT EXISTS product (
 id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(255) NOT NULL UNIQUE,
 price INT(11) NOT NULL,
 image VARCHAR(255) NOT NULL,
 category_id INT(11) NOT NULL,
)CHARACTER SET utf8mb4;

INSERT INTO product(id,name,price,image,category_id) VALUES (1,"柴犬（赤）",2000000,"/img/dog001.jpg",1);
INSERT INTO product(id,name,price,image,category_id) VALUES (2,"柴犬（黒）",2500000,"/img/dog002.jpg",1);
INSERT INTO product(id,name,price,image,category_id) VALUES (3,"柴犬（白）",1500000,"/img/dog003.jpg",1);
INSERT INTO product(id,name,price,image,category_id) VALUES (4,"猫（ハチワレ）",10000,"/img/cat001.jpg",2);
INSERT INTO product(id,name,price,image,category_id) VALUES (5,"猫（茶トラ）",10000,"/img/cat002.jpg",2);
INSERT INTO product(id,name,price,image,category_id) VALUES (6,"猫（三毛）",10000,"/img/cat003.jpg",2);
INSERT INTO product(id,name,price,image,category_id) VALUES (7,"モルモット（ショート）",50000,"/img/mol001.jpg",3);
INSERT INTO product(id,name,price,image,category_id) VALUES (8,"モルモット（アビシニアン）",50000,"/img/mol002.jpg",3);
INSERT INTO product(id,name,price,image,category_id) VALUES (9,"モルモット（テディ）",50000,"/img/mol003.jpg",3);