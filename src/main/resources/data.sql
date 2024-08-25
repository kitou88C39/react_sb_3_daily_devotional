INSERT INTO
    DEVOTIONAL(id, auote, atuhor, image_path)
SELECT
    1, "And she shall bring forth as son, and"
WHERE
    NOT EXISTS(SELECT id FROM DEVOTIONAL WHERE)