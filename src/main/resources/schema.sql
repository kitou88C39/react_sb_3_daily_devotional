CREATE TABLE DEVOTIONAL (
    id INTEGER NOT NULL AUTO_INCREMENT,
    quote VARCHAR(255),
    author VARCHAR(255),
    image_path VARCHAR(255),
    content VARCHAR(5000),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    published_at DATA,
)