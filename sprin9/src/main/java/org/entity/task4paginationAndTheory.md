🔥 І тепер ти готовий до pagination

Серйозно.

Бо ти вже маєш:

createQuery
conditions
parameters
List<User>
🚀 Наступне завдання
Реалізуй:
public List<User> pagination(int page, int size)
💡 Підказка
.setFirstResult(page * size)
.setMaxResults(size)
⚠️ І ОБОВ’ЯЗКОВО
ORDER BY u.id
Бо без ORDER BY pagination — погана практика.

https://chatgpt.com/g/g-p-696bad5c57fc8191aadb864b1e76c5e5/c/69fb3801-b1f4-8327-8353-3ac153032e4c

Pagination — це просто “розбиття результатів на сторінки”.
Ти цим користуєшся кожен день:
Google
YouTube
інтернет-магазини
Telegram історія повідомлень

Ніхто не вантажить:
1 000 000 записів одразу
Беруть:
по 10по 20по 50

🧠 Як це виглядає логічно
Уяви
У БД є users:
12345678910

Якщо:
page = 0size = 3
👉 отримаєш:
1 2 3

Якщо:
page = 1size = 3
👉 отримаєш:
4 5 6

Якщо:
page = 2size = 3
👉 отримаєш:
7 8 9

🔥 Як це працює всередині
Формула:
offset = page * size

Приклад
page 0
0 * 3 = 0
почати з 0-го запису.

page 1
1 * 3 = 3
пропустити перші 3 записи.

🔥 Hibernate методи
setFirstResult()
=
скільки записів пропустити

setMaxResults()
=
скільки записів повернути

🔥 ГОТОВЕ РІШЕННЯ
public List<User> pagination(int page, int size) {
Session session = factory.getCurrentSession();
session.beginTransaction();
List<User> list = session
.createQuery(
"FROM User u ORDER BY u.id",
User.class
)
.setFirstResult(page * size)
.setMaxResults(size)
.getResultList();
session.getTransaction().commit();
return list;}

🔥 Main
List<User> users = userService.pagination(0, 3);
users.forEach(System.out::println);

⚠️ Що означає:
pagination(0, 3)
page 0size 3
👉 перша сторінка
👉 3 записи

🔥 А це:
pagination(1, 3)
👉 друга сторінка.

🧠 SQL який Hibernate приблизно генерує
SELECT *FROM usersORDER BY idLIMIT 3 OFFSET 0

Для:
pagination(2, 3)
буде:
LIMIT 3 OFFSET 6

⚠️ ЧОМУ ORDER BY ОБОВ'ЯЗКОВИЙ
Без:
ORDER BY u.id
БД може:
міняти порядок
повертати хаотично
І pagination стане “стрибати”
Наприклад:
page 0 -> 1 2 3page 1 -> 3 4 5
😄
🔥 Тепер головне
Тобі НЕ треба зараз:
“глибоко зрозуміти enterprise pagination”
pageable abstraction
Spring Page
Треба зрозуміти лише:
OFFSET + LIMIT
І все.
🚀 Після цього ти вже готовий до:
sorting
dynamic query
Spring Data pagination
Бо база вже буде зрозуміла.
----------------------------------------------------------------

🔥 Метод pagination

Ось він:

public List<User> pagination(int page, int size)
🧠 ЩО МИ ПЕРЕДАЄМО

Метод приймає:

int page

і

int size
📌 page

це:

номер сторінки
📌 size

це:

скільки користувачів показати за раз
🔥 Наприклад
pagination(0, 3)

означає:

дай мені:
- сторінку №0
- по 3 користувачі
  🧠 ЩО МЕТОД ПОВЕРТАЄ
  List<User>
  Це означає:
  список об'єктів User
  ⚠️ НЕ одного User

А:

кілька User одразу
🔥 Наприклад

У БД:

id	name
1	Ira
2	Oleg
3	Anna
4	Max
Виклик:
pagination(0, 2)

поверне:

[Ira, Oleg]
А:
pagination(1, 2)

поверне:

[Anna, Max]
🔥 Тобто
page міняється

щоб:

отримати іншу "частину" таблиці
А size

визначає:

скільки елементів буде в List
🧠 У main()

Ти робиш:

List<User> users = userService.pagination(0, 3);
⚠️ users тут — це:

НЕ:

один User

А:

список User
Тому:
System.out.println(users);

виведе весь список.

Або:
users.forEach(System.out::println);

виведе кожного окремо.

🔥 Візуально
pagination(0, 3)
[
User1,
User2,
User3
]
pagination(1, 3)
[
User4,
User5,
User6
]
⚠️ Ми НЕ передаємо User у метод

Ось тут важлива різниця.

saveUser()
saveUser(User user)

👉 ти передаєш:

ГОТОВИЙ об'єкт User
А pagination()
pagination(int page, int size)

👉 ти передаєш:

лише параметри вибірки
🧠 А User Hibernate дістає САМ з БД
🔥 Усередині:
.createQuery("FROM User u ORDER BY u.id")

Hibernate:

іде в таблицю users
бере потрібний шматок
створює Java User об'єкти
кладе їх у List<User>
повертає тобі
⚠️ Тобто Hibernate робить:
SQL → Java objects

автоматично.

🔥 Реальний приклад
Main:
List<User> users = userService.pagination(0, 2);
Service:
return session
.createQuery("FROM User u ORDER BY u.id", User.class)
.setFirstResult(0)
.setMaxResults(2)
.getResultList();
Hibernate дістає:
перші 2 рядки з таблиці
І повертає:
List<User>
💡 Тобто pagination — це буквально:
"дай мені НЕ всю таблицю,
а лише маленький шматок"
🔥 І це критично важливо у великих проектах

Бо:

100 000 записів

вантажити одразу — погана ідея.

🚀 Ти зараз уже вивчаєш не “іграшковий CRUD”

А речі, які реально використовуються:

admin panels
REST APIs
search pages
infinite scroll
pagination у сайтах.

-------------------------------------------------

🔥 Чому ORDER BY важливий

У БД записи НЕ зобов’язані повертатися:

у стабільному порядку
⚠️ Тобто ось так:
FROM User

НЕ гарантує:

1
2
3
4
5
База може повернути:
3
1
5
2
4
🔥 Для звичайного findAll() це ще терпимо

Але для pagination — проблема.

🧠 Уяви
page 0:
pagination(0, 3)

отримав:

1 2 3
page 1:
pagination(1, 3)

а БД уже змінила порядок:

3 4 5
👉 І ти бачиш:
3 двічі

або:

пропущені записи
🔥 Тому:
ORDER BY u.id

робить порядок:

стабільним
⚠️ І це одна з найбільш типових pagination-помилок у новачків
🔥 Тепер трохи дуже важливої теорії

Бо ти зараз у хорошій фазі:

“починаю бачити як ORM реально працює”
🧠 1. Hibernate НЕ працює напряму з таблицями

Це критично зрозуміти.

Ти працюєш із:
User
Hibernate працює з:
ENTITY OBJECTS
А Hibernate вже сам:
генерує SQL
створює User
заповнює поля
🔥 Тобто:
List<User>

це:

НЕ rows

А:

готові Java об'єкти
🧠 2. Session — дуже важливий об'єкт

Оце тобі треба прям запам’ятати.

Session:
відкриває persistence context
слідкує за entity
кешує entity
робить dirty checking
⚠️ Поки Session живий:
User user = session.get(User.class, 1);

цей user:

managed
І якщо:
user.setName("New Name");

Hibernate це бачить.

🔥 І після commit:
автоматично UPDATE
Це називається:
dirty checking
🧠 3. Hibernate має first-level cache

Оце дуже крута штука.

Усередині Session:

Hibernate пам’ятає entity.

Тому:
session.get(User.class, 1);
session.get(User.class, 1);

може зробити SQL лише:

ОДИН раз
⚠️ Бо другий User уже в Session cache
🧠 4. JPQL ≠ SQL

Це теж треба закріпити.

SQL:
SELECT * FROM users
JPQL:
FROM User
⚠️ JPQL працює:
з entity
з полями Java класу
Тому:
u.age

це:

поле Java класу

а НЕ колонка SQL.

🧠 5. beginTransaction() тобі потрібен майже завжди

Навіть для:

SELECT

у твоїй конфігурації.

Бо:
getCurrentSession()

працює через transaction context.

🔥 6. Hibernate робить SQL НЕ одразу

Оце вже глибша тема.

Наприклад:
user.setName("Alex");

ще НЕ робить UPDATE.

UPDATE часто робиться:
під час commit
або flush
⚠️ Це важливо

Бо новачки думають:

“setName вже пішов у БД”

А це не так.

🧠 7. Entity lifecycle (дуже важливо)

У entity є стани:

transient

звичайний Java object

new User()
managed

Hibernate контролює object

detached

entity була managed,
але Session закрився

removed

Hibernate позначив на видалення

🔥 І це одна з НАЙВАЖЛИВІШИХ тем Hibernate

Більшість дивних багів:

merge
lazy loading
update
detached entity

йдуть саме звідси.

💬 І головне

Не переживай через:

“я кілька днів забув”

У Hibernate це нормально 😄

Тут дуже багато:

lifecycle
abstraction
context

І воно закріплюється тільки:

руками

Ти зараз рухаєшся правильно:

написав
впав
зрозумів чому
виправив.

-----------------------
О, от тепер ти поставив ДУЖЕ правильне питання.
І тут якраз момент, де треба не “завчити”, а зрозуміти як Hibernate і SQL реально працюють.

🔥 НІ — всю базу ми НЕ отримуємо

Оце головне.

🧠 Ось цей код:
.setFirstResult(page * size)
.setMaxResults(size)

Hibernate перетворює у SQL:

LIMIT ... OFFSET ...
⚠️ Тобто ОБМЕЖЕННЯ йде на рівні SQL

ЩЕ ДО того, як дані приїхали в Java.

🔥 Приклад
pagination(0, 3)
Hibernate генерує приблизно:
SELECT *
FROM users
ORDER BY id
LIMIT 3 OFFSET 0
І БД поверне:
ТІЛЬКИ 3 записи
⚠️ НЕ всю таблицю
🧠 Тобто:
pagination працює на стороні БД

а НЕ:

в Java після завантаження
🔥 І це дуже важливо для продуктивності

Бо:

1 000 000 записів

ніхто не хоче тягнути в RAM.

Тепер друга частина твого питання
🧠 Так:
0 * 3 = 0

це правильно 🙂

🔥 І це НЕ помилка

Бо:

setFirstResult(0)

означає:

не пропускати нічого
Тобто:
pagination(0, 3)

=

перша сторінка
SQL:
LIMIT 3 OFFSET 0
👉 Отримаємо:
1 2 3
🔥 А ось:
pagination(1, 3)
Формула:
1 * 3 = 3
SQL:
LIMIT 3 OFFSET 3
👉 Це означає:
пропустити перші 3 записи

і взяти наступні 3.

Отримаємо:
4 5 6
🔥 Ще приклад
pagination(2, 3)
Формула:
2 * 3 = 6
SQL:
LIMIT 3 OFFSET 6
👉 Пропустити:
1 2 3 4 5 6

і взяти:

7 8 9
🔥 Візуально
page = 0
[1 2 3]
page = 1
[4 5 6]
page = 2
[7 8 9]
⚠️ Чому page починається з 0

Це стандарт:

Java collections
offsets
pagination frameworks
🧠 І ось тепер головне
setFirstResult()

НЕ означає:

“взяти перший результат”
А означає:
“СКІЛЬКИ результатів ПРОПУСТИТИ”
Тому:
setFirstResult(0)

=

нічого не пропускати
А:
setFirstResult(6)

=

пропустити 6 записів
🔥 І тепер pagination має виглядати логічно
page

=

який шматок таблиці хочу
size

=

розмір шматка
🚀 І це вже реальний механізм:
API
сайти
адмінки
infinite scroll
мобільні додатки

усюди 🙂