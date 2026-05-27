-- Write your query below
SELECT p.first_name, p.last_name, a.city, a.state FROM PERSON p
LEFT OUTER JOIN ADDRESS a ON p.person_id = a.person_id;