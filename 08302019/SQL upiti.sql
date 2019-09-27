--Resenje 1. zadatka

SELECT *
FROM Fakultet
WHERE "Drzavni/Privatni"="D"

--Resenje 2. zadatka

SELECT Naziv
FROM Fakultet
WHERE "Drzavni/Privatni" is "P"

--Resenje 3. zadatka

SELECT sum("Drzavni/Privatni" = "D")
FROM Fakultet

--Resenje 4. zadatka

SELECT avg (BrojStudenata) 
FROM Fakultet

--Resenje 5. zadatka

SELECT avg(BrojStudenata)
FROM Fakultet
WHERE ("Drzavni/Privatni" = "D")

--Resenje 6. zadatka

SELECT DISTINCT Grad
FROM Fakultet

--Resenje 7. zadatka

SELECT sum(BrojStudenata)
FROM Fakultet

--Resenje 8. zadatka

SELECT Ime, Prezime
FROM Student

--Resenje 9. zadatka

SELECT * 
FROM Student
WHERE GodinaStudija=3

--Resenje 10. zadatka

SELECT Ime, Prezime, max(Prosek)
FROM Student

--Resenje 11. zadatka

SELECT *, max(Prosek)
FROM Student
WHERE GodinaStudija=3

--Resenje 12. zadatka

SELECT avg(Prosek)
FROM Student
WHERE GodinaStudija is 4

--Resenje 13. zadatka

SELECT avg(Prosek)
FROM Student
WHERE Pol="M"

--Resenje 14. zadatka

SELECT *
FROM Student
WHERE Prosek is NULL

--Resenje 15. zadatka

SELECT *
FROM Student
WHERE Prosek is not NULL

--Resenje 16. zadatka

SELECT *
FROM Student
WHERE Prosek>(SELECT avg(Prosek)FROM Student)




