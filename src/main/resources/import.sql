-- Login ADMIN
INSERT INTO USERS (NAME, PASSWORD, ROLE) VALUES('admin', '$2a$10$LrgpGvY0exByWPfdeBzTmuT6kdzU1sjDUhBv0fh3SRVGajDvUxzv.', 'ADMIN');

-- Lista de Categorias
INSERT INTO category (name, active, type) VALUES ('Tecnologia', true, 'NORMAL');
INSERT INTO category (name, active, type) VALUES('Saúde', true, 'SPECIAL');
INSERT INTO category (name, active, type) VALUES('Educação', true, 'CUSTOM');
INSERT INTO category (name, active, type) VALUES('Entretenimento', true, 'NORMAL');
INSERT INTO category (name, active, type) VALUES('Negócios', true, 'SPECIAL');
INSERT INTO category (name, active, type) VALUES('Esportes', true, 'CUSTOM');
INSERT INTO category (name, active, type) VALUES('Culinária', true, 'NORMAL');
INSERT INTO category (name, active, type) VALUES('Turismo', true, 'SPECIAL');
INSERT INTO category (name, active, type) VALUES('Arte', true, 'CUSTOM');
INSERT INTO category (name, active, type) VALUES('Música', true, 'NORMAL');

-- Categoria Tecnologia
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Notebook Gamer', true, 'TECH001', 1, 4500.00, 18.0, 5500.00, '2024-12-01', 25);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Smartphone X', true, 'TECH002', 1, 1200.00, 12.0, 1500.00, '2024-12-02', 50);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Tablet Pro', true, 'TECH003', 1, 800.00, 10.0, 1000.00, '2024-12-03', 40);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Monitor 4K', true, 'TECH004', 1, 1500.00, 18.0, 2000.00, '2024-12-04', 30);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Mouse Gamer', true, 'TECH005', 1, 120.00, 5.0, 180.00, '2024-12-05', 80);

-- Categoria Saúde
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Kit Primeiros Socorros', true, 'HEALTH001', 2, 50.00, 5.0, 75.00, '2024-12-06', 150);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Suplemento Vitamínico', true, 'HEALTH002', 2, 30.00, 8.0, 45.00, '2024-12-07', 300);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Esteira Elétrica', true, 'HEALTH003', 2, 1200.00, 15.0, 1500.00, '2024-12-08', 10);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Tensiômetro Digital', true, 'HEALTH004', 2, 80.00, 10.0, 120.00, '2024-12-09', 40);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Oxímetro de Pulso', true, 'HEALTH005', 2, 60.00, 8.0, 90.00, '2024-12-10', 70);

-- Categoria Educação
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Curso Online JavaScript', true, 'EDU001', 3, 200.00, 2.0, 300.00, '2024-12-11', 100);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Livro Programação Python', true, 'EDU002', 3, 50.00, 5.0, 70.00, '2024-12-12', 200);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Material Didático Matemática', true, 'EDU003', 3, 80.00, 5.0, 120.00, '2024-12-13', 150);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Curso Excel Avançado', true, 'EDU004', 3, 300.00, 10.0, 450.00, '2024-12-14', 80);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Kit Experimentos Ciência', true, 'EDU005', 3, 150.00, 8.0, 200.00, '2024-12-15', 60);

-- Categoria Entretenimento
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Console de Videogame', true, 'ENT001', 4, 2000.00, 15.0, 2500.00, '2024-12-16', 20);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Jogo de Tabuleiro', true, 'ENT002', 4, 100.00, 10.0, 150.00, '2024-12-17', 100);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Fone VR', true, 'ENT003', 4, 800.00, 18.0, 1200.00, '2024-12-18', 15);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Caixa de Som Bluetooth', true, 'ENT004', 4, 300.00, 15.0, 450.00, '2024-12-19', 25);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Drone Recreativo', true, 'ENT005', 4, 1200.00, 18.0, 1700.00, '2024-12-20', 15);

-- Categoria Negócios
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Plano Consultoria Financeira', true, 'BUS001', 5, 500.00, 8.0, 750.00, '2024-12-21', 50);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Sistema ERP', true, 'BUS002', 5, 10000.00, 15.0, 12500.00, '2024-12-22', 5);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Ferramenta Gestão Projetos', true, 'BUS003', 5, 300.00, 5.0, 450.00, '2024-12-23', 30);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Assinatura CRM', true, 'BUS004', 5, 2000.00, 12.0, 3000.00, '2024-12-01', 10);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Curso Gestão Ágil', true, 'BUS005', 5, 600.00, 10.0, 900.00, '2024-12-02', 20);

-- Categoria Esportes
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Camiseta Esportiva', true, 'SPORT001', 6, 30.00, 5.0, 50.00, '2024-12-03', 200);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Tênis Corrida', true, 'SPORT002', 6, 150.00, 10.0, 200.00, '2024-12-04', 100);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Bola de Futebol', true, 'SPORT003', 6, 40.00, 5.0, 60.00, '2024-12-05', 300);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Raquete de Tênis', true, 'SPORT004', 6, 300.00, 10.0, 450.00, '2024-12-06', 50);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Halteres Ajustáveis', true, 'SPORT005', 6, 500.00, 15.0, 750.00, '2024-12-07', 40);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Prancha de Surf', true, 'SPORT006', 6, 800.00, 12.0, 1200.00, '2024-12-08', 30);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Mochila de Hidratação', true, 'SPORT007', 6, 150.00, 10.0, 220.00, '2024-12-09', 80);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Bicicleta Mountain Bike', true, 'SPORT008', 6, 2000.00, 18.0, 2800.00, '2024-12-10', 15);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Luvas de Academia', true, 'SPORT009', 6, 50.00, 5.0, 75.00, '2024-12-11', 120);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Cordas de Pular', true, 'SPORT010', 6, 20.00, 3.0, 30.00, '2024-12-12', 200);

-- Categoria Culinaria
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Liquidificador', true, 'HOME001', 7, 200.00, 10.0, 300.00, '2024-12-13', 50);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Conjunto de Panelas', true, 'HOME002', 7, 400.00, 12.0, 600.00, '2024-12-14', 40);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Jogo de Talheres', true, 'HOME003', 7, 100.00, 5.0, 150.00, '2024-12-15', 100);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Faqueiro Inox', true, 'HOME004', 7, 150.00, 8.0, 220.00, '2024-12-16', 70);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES('Assadeira Antiaderente', true, 'HOME005', 7, 80,6.0,130.00,'2024-12-17',45);

-- Categoria Turismo
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Pacote de Viagem para Paris', true, 'TURISMO001', 8, 1500.00, 10.0, 2000.00, '2024-12-23', 50);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Tour pelas Ilhas Maldivas', true, 'TURISMO002', 8, 2500.00, 12.0, 3200.00, '2024-12-23', 30);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Expedição à Amazônia', true, 'TURISMO003', 8, 1800.00, 10.0, 2500.00, '2024-12-23', 40);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Tour de Aventura no Chile', true, 'TURISMO004', 8, 1200.00, 10.0, 1600.00, '2024-12-23', 60);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Pacote para Conhecer a Europa', true, 'TURISMO005', 8, 4000.00, 15.0, 5000.00, '2024-12-23', 20);

-- Categoria Arte
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Pintura Abstracta', true, 'ARTE001', 9, 500.00, 7.0, 800.00, '2024-12-23', 30);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Escultura Moderna', true, 'ARTE002', 9, 1200.00, 10.0, 1600.00, '2024-12-23', 15);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Gravura Contemporânea', true, 'ARTE003', 9, 800.00, 7.0, 1200.00, '2024-12-23', 25);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Quadro Realista - Paisagem', true, 'ARTE004', 9, 1000.00, 7.0, 1500.00, '2024-12-23', 20);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Pintura de Rua - Mural', true, 'ARTE005', 9, 600.00, 7.0, 950.00, '2024-12-23', 40);

-- Categoria Música
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('CD de Jazz - Coleção', true, 'MUSICA001', 10, 25.00, 5.0, 50.00, '2024-12-23', 200);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Álbum de Rock Clássico', true, 'MUSICA002', 10, 30.00, 5.0, 60.00, '2024-12-23', 180);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Música Eletrônica - Hits 2024', true, 'MUSICA003', 10, 15.00, 5.0, 35.00, '2024-12-23', 150);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Álbum de MPB - Clássicos', true, 'MUSICA004', 10, 20.00, 5.0, 45.00, '2024-12-23', 120);
INSERT INTO product (name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES('Coleção de Música Clássica', true, 'MUSICA005', 10, 40.00, 5.0, 80.00, '2024-12-23', 90);

