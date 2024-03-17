CREATE TABLE books(
    isbn TEXT NOT NULL,
    title TEXT,
    CONSTRAINT "books_pkey" PRIMARY KEY (isbn)
)