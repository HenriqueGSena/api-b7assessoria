-- Lista de Categorias
INSERT INTO category (id, name, active, type) VALUES (1, 'Tecnologia', true, 'NORMAL');
INSERT INTO category (id, name, active, type) VALUES(2, 'Saúde', true, 'SPECIAL');
INSERT INTO category (id, name, active, type) VALUES(3, 'Educação', true, 'CUSTOM');
INSERT INTO category (id, name, active, type) VALUES(4, 'Entretenimento', true, 'NORMAL');
INSERT INTO category (id, name, active, type) VALUES(5, 'Negócios', true, 'SPECIAL');
INSERT INTO category (id, name, active, type) VALUES(6, 'Esportes', true, 'CUSTOM');
INSERT INTO category (id, name, active, type) VALUES(7, 'Culinária', true, 'NORMAL');
INSERT INTO category (id, name, active, type) VALUES(8, 'Turismo', true, 'SPECIAL');
INSERT INTO category (id, name, active, type) VALUES(9, 'Arte', true, 'CUSTOM');
INSERT INTO category (id, name, active, type) VALUES(10, 'Música', true, 'NORMAL');

-- Categoria Tecnologia
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(1, 'Notebook Gamer', true, 'TECH001', 1, 4500.00, 18.0, 5500.00, '2024-12-01', 25);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(2, 'Smartphone X', true, 'TECH002', 1, 1200.00, 12.0, 1500.00, '2024-12-02', 50);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(3, 'Tablet Pro', true, 'TECH003', 1, 800.00, 10.0, 1000.00, '2024-12-03', 40);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(4, 'Monitor 4K', true, 'TECH004', 1, 1500.00, 18.0, 2000.00, '2024-12-04', 30);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(5, 'Mouse Gamer', true, 'TECH005', 1, 120.00, 5.0, 180.00, '2024-12-05', 80);

-- Categoria Saúde
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(6, 'Kit Primeiros Socorros', true, 'HEALTH001', 2, 50.00, 5.0, 75.00, '2024-12-06', 150);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(7, 'Suplemento Vitamínico', true, 'HEALTH002', 2, 30.00, 8.0, 45.00, '2024-12-07', 300);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(8, 'Esteira Elétrica', true, 'HEALTH003', 2, 1200.00, 15.0, 1500.00, '2024-12-08', 10);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(9, 'Tensiômetro Digital', true, 'HEALTH004', 2, 80.00, 10.0, 120.00, '2024-12-09', 40);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(10, 'Oxímetro de Pulso', true, 'HEALTH005', 2, 60.00, 8.0, 90.00, '2024-12-10', 70);

-- Categoria Educação
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(11, 'Curso Online JavaScript', true, 'EDU001', 3, 200.00, 2.0, 300.00, '2024-12-11', 100);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(12, 'Livro Programação Python', true, 'EDU002', 3, 50.00, 5.0, 70.00, '2024-12-12', 200);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(13, 'Material Didático Matemática', true, 'EDU003', 3, 80.00, 5.0, 120.00, '2024-12-13', 150);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(14, 'Curso Excel Avançado', true, 'EDU004', 3, 300.00, 10.0, 450.00, '2024-12-14', 80);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(15, 'Kit Experimentos Ciência', true, 'EDU005', 3, 150.00, 8.0, 200.00, '2024-12-15', 60);

-- Categoria Entretenimento
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(16, 'Console de Videogame', true, 'ENT001', 4, 2000.00, 15.0, 2500.00, '2024-12-16', 20);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(17, 'Jogo de Tabuleiro', true, 'ENT002', 4, 100.00, 10.0, 150.00, '2024-12-17', 100);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(18, 'Fone VR', true, 'ENT003', 4, 800.00, 18.0, 1200.00, '2024-12-18', 15);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(19, 'Caixa de Som Bluetooth', true, 'ENT004', 4, 300.00, 15.0, 450.00, '2024-12-19', 25);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(20, 'Drone Recreativo', true, 'ENT005', 4, 1200.00, 18.0, 1700.00, '2024-12-20', 15);

-- Categoria Negócios
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(21, 'Plano Consultoria Financeira', true, 'BUS001', 5, 500.00, 8.0, 750.00, '2024-12-21', 50);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(22, 'Sistema ERP', true, 'BUS002', 5, 10000.00, 15.0, 12500.00, '2024-12-22', 5);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(23, 'Ferramenta Gestão Projetos', true, 'BUS003', 5, 300.00, 5.0, 450.00, '2024-12-23', 30);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(24, 'Assinatura CRM', true, 'BUS004', 5, 2000.00, 12.0, 3000.00, '2024-12-01', 10);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(25, 'Curso Gestão Ágil', true, 'BUS005', 5, 600.00, 10.0, 900.00, '2024-12-02', 20);

-- Categoria Esportes
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(26, 'Camiseta Esportiva', true, 'SPORT001', 6, 30.00, 5.0, 50.00, '2024-12-03', 200);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(27, 'Tênis Corrida', true, 'SPORT002', 6, 150.00, 10.0, 200.00, '2024-12-04', 100);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(28, 'Bola de Futebol', true, 'SPORT003', 6, 40.00, 5.0, 60.00, '2024-12-05', 300);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(29, 'Raquete de Tênis', true, 'SPORT004', 6, 300.00, 10.0, 450.00, '2024-12-06', 50);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(30, 'Halteres Ajustáveis', true, 'SPORT005', 6, 500.00, 15.0, 750.00, '2024-12-07', 40);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(31, 'Prancha de Surf', true, 'SPORT006', 6, 800.00, 12.0, 1200.00, '2024-12-08', 30);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(32, 'Mochila de Hidratação', true, 'SPORT007', 6, 150.00, 10.0, 220.00, '2024-12-09', 80);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(33, 'Bicicleta Mountain Bike', true, 'SPORT008', 6, 2000.00, 18.0, 2800.00, '2024-12-10', 15);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(34, 'Luvas de Academia', true, 'SPORT009', 6, 50.00, 5.0, 75.00, '2024-12-11', 120);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(35, 'Cordas de Pular', true, 'SPORT010', 6, 20.00, 3.0, 30.00, '2024-12-12', 200);

-- Categoria Culinaria
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(36, 'Liquidificador', true, 'HOME001', 7, 200.00, 10.0, 300.00, '2024-12-13', 50);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(37, 'Conjunto de Panelas', true, 'HOME002', 7, 400.00, 12.0, 600.00, '2024-12-14', 40);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(38, 'Jogo de Talheres', true, 'HOME003', 7, 100.00, 5.0, 150.00, '2024-12-15', 100);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(39, 'Faqueiro Inox', true, 'HOME004', 7, 150.00, 8.0, 220.00, '2024-12-16', 70);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock) VALUES(40, 'Assadeira Antiaderente', true, 'HOME005', 7, 80,6.0,130.00,'2024-12-17',45);

-- Categoria Turismo
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(41, 'Pacote de Viagem para Paris', true, 'TURISMO001', 8, 1500.00, 10.0, 2000.00, '2024-12-23', 50);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(42, 'Tour pelas Ilhas Maldivas', true, 'TURISMO002', 8, 2500.00, 12.0, 3200.00, '2024-12-23', 30);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(43, 'Expedição à Amazônia', true, 'TURISMO003', 8, 1800.00, 10.0, 2500.00, '2024-12-23', 40);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(44, 'Tour de Aventura no Chile', true, 'TURISMO004', 8, 1200.00, 10.0, 1600.00, '2024-12-23', 60);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(45, 'Pacote para Conhecer a Europa', true, 'TURISMO005', 8, 4000.00, 15.0, 5000.00, '2024-12-23', 20);

-- Categoria Arte
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(46, 'Pintura Abstracta', true, 'ARTE001', 9, 500.00, 7.0, 800.00, '2024-12-23', 30);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(47, 'Escultura Moderna', true, 'ARTE002', 9, 1200.00, 10.0, 1600.00, '2024-12-23', 15);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(48, 'Gravura Contemporânea', true, 'ARTE003', 9, 800.00, 7.0, 1200.00, '2024-12-23', 25);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(49, 'Quadro Realista - Paisagem', true, 'ARTE004', 9, 1000.00, 7.0, 1500.00, '2024-12-23', 20);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(50, 'Pintura de Rua - Mural', true, 'ARTE005', 9, 600.00, 7.0, 950.00, '2024-12-23', 40);

-- Categoria Música
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(51, 'CD de Jazz - Coleção', true, 'MUSICA001', 10, 25.00, 5.0, 50.00, '2024-12-23', 200);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(52, 'Álbum de Rock Clássico', true, 'MUSICA002', 10, 30.00, 5.0, 60.00, '2024-12-23', 180);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(53, 'Música Eletrônica - Hits 2024', true, 'MUSICA003', 10, 15.00, 5.0, 35.00, '2024-12-23', 150);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(54, 'Álbum de MPB - Clássicos', true, 'MUSICA004', 10, 20.00, 5.0, 45.00, '2024-12-23', 120);
INSERT INTO product (id, name, active, sku, category_id, cost_value, icms, selling_value, registration_date, quantity_stock)VALUES(55, 'Coleção de Música Clássica', true, 'MUSICA005', 10, 40.00, 5.0, 80.00, '2024-12-23', 90);

