USE db_donaton;

CREATE TABLE `user_type` (
  `id_user_type` bigint NOT NULL AUTO_INCREMENT,
  `user_type` varchar(255) NOT NULL UNIQUE,
  PRIMARY KEY (`id_user_type`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO user_type (user_type) VALUES
("user"),
("admin");
