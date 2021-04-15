INSERT INTO avesmarket_ms_rri.public.brand(name, description, storage_file_id)
VALUES ('ВР', null, null),
       ('Mercury', null, null),
       ('CAS', null, null),
       ('ВСП', null, null),
       ('M-ER', null, null),
       ('A&D', null, null),
       ('MAS', null, null);

INSERT INTO avesmarket_ms_rri.public.product (name, description, description_html, brand_id, created_date, modified_date)
VALUES ('CAS SWN-3', null, null, 3, current_timestamp, current_timestamp),
       ('CAS SWN-6', null, null, 3, current_timestamp, current_timestamp),
       ('CAS SWN-15', null, null, 3, current_timestamp, current_timestamp),
       ('CAS SWN-30', null, null, 3, current_timestamp, current_timestamp),
       ('CAS SW-2', null, null, 3, current_timestamp, current_timestamp),
       ('CAS SW-5', null, null, 3, current_timestamp, current_timestamp),
       ('CAS SW-10', null, null, 3, current_timestamp, current_timestamp),
       ('CAS SW-20', null, null, 3, current_timestamp, current_timestamp);

INSERT INTO avesmarket_ms_rri.public.characteristic(name)
VALUES ('Бренд'),('Тип'),('Макс. вес (НПВ)'),('Дискретность (d)'),('Калибровка')
     ,('Минимальный вес (НмПВ)'),('Класс точности'),('Источник питания'),('Функции и режимы'),('Тип индикации')
     ,('Материал платформы'),('Сертификация'),('Поверка'),('Габариты'),('Масса весов')
     ,('Родина бренда'),('Гарантия'),('Вес'),('Время непрерывной работы от аккумулятора / батареи'),('Исполнение')
     ,('Расчет стоимости'),('Печать этикетки');

INSERT INTO avesmarket_ms_rri.public.collection(name, description)
VALUES ('Фасовочные весы', null),
       ('Торговые весы', null),
       ('Напольные весы', null),
       ('Лабораторные весы', null),
       ('Аналитические весы', null),
       ('Влагозащищенные весы', null),
       ('Счетные весы', null),
       ('Крановые весы', null),
       ('Печатающие весы', null),
       ('Медицинские весы', null),
       ('Платформенные весы', null),
       ('Паллетные весы', null),
       ('Стержневые весы', null),
       ('Автомобильные весы', null),
       ('Мобильные весы', null),
       ('Гири', null),
       ('Весы безмены', null),
       ('Портативные весы', null),
       ('Механические весы', null);

INSERT INTO avesmarket_ms_rri.public.unit (name) VALUES
('мг'),('г'),('кг'),('ц'),('т'),
('мм'),('см'),('м'),('км');

INSERT INTO avesmarket_ms_rri.public.value (name, unit_id)
VALUES ('3', 3),
       ('6', 3),
       ('5', 3),
       ('10', 3),
       ('15', 3),
       ('20', 3),
       ('30', 3),
       ('32', 3),
       ('2', 3),
       ('0.5/1', 2),
       ('1/2', 2),
       ('2/5', 2),
       ('5/10', 2);

INSERT INTO avesmarket_ms_rri.public.product_properties (product_id, characteristic_id)
VALUES (1, 3),
       (1, 4);

INSERT INTO avesmarket_ms_rri.public.product_properties_values (product_properties_id, value_id)
VALUES (1, 1),
       (2, 10);



