SELECT student.name, student.age, faculty.name
FROM student
INNER JOIN faculty ON student.faculty_id = faculty.id;

SELECT student.name AS student, avatar.id AS avatar_id
FROM student
INNER JOIN avatar ON avatar.student_id = student.id;