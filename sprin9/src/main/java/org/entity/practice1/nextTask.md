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
