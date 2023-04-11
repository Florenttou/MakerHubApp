INSERT INTO annonce (date_de_creation, "titre", "description", prix) VALUES (now(), 'Citroen c3 à vendre', 'Full option, année 2022, état neuf', 6000);
INSERT INTO annonce (date_de_creation, "titre", "description", prix) VALUES (now(), 'Flipper arcade année 2000', 'état casiment neuf', 1000);
INSERT INTO annonce (date_de_creation, "titre", "description", prix) VALUES (now(), 'playstation5', 'Ayez la chance de m acheté cette console, elles partent comme des petits pains', 1100);

INSERT INTO  categorie ("name") VALUES ('Automobile');
INSERT INTO  categorie ("name") VALUES ('Jeux-vidéo');
INSERT INTO  categorie ("name") VALUES ('Bricolage');

INSERT INTO annonce_categories (annonce_annonce_id, categories_categorie_id) VALUES (1,1);
INSERT INTO annonce_categories (annonce_annonce_id, categories_categorie_id) VALUES (2,2);
INSERT INTO annonce_categories (annonce_annonce_id, categories_categorie_id) VALUES (3,2);