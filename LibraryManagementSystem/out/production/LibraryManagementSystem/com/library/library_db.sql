-- Library Management System Database Schema
-- Run this in MySQL Workbench or MySQL CLI

CREATE DATABASE IF NOT EXISTS library_db;
USE library_db;

-- Books Table
CREATE TABLE IF NOT EXISTS books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) UNIQUE NOT NULL,
    genre VARCHAR(100),
    total_copies INT DEFAULT 1,
    available_copies INT DEFAULT 1,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Members Table
CREATE TABLE IF NOT EXISTS members (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    phone VARCHAR(20),
    address TEXT,
    joined_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Borrow Records Table
CREATE TABLE IF NOT EXISTS borrow_records (
    id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT NOT NULL,
    member_id INT NOT NULL,
    borrow_date DATE NOT NULL,
    due_date DATE NOT NULL,
    return_date DATE,
    status ENUM('BORROWED', 'RETURNED', 'OVERDUE') DEFAULT 'BORROWED',
    FOREIGN KEY (book_id) REFERENCES books(id),
    FOREIGN KEY (member_id) REFERENCES members(id)
);

-- Sample Data
INSERT INTO books (title, author, isbn, genre, total_copies, available_copies) VALUES
('The Great Gatsby', 'F. Scott Fitzgerald', '978-0743273565', 'Fiction', 3, 3),
('To Kill a Mockingbird', 'Harper Lee', '978-0061935466', 'Fiction', 2, 2),
('1984', 'George Orwell', '978-0451524935', 'Dystopian', 4, 4),
('Clean Code', 'Robert C. Martin', '978-0132350884', 'Technology', 2, 2),
('The Pragmatic Programmer', 'Andrew Hunt', '978-0201616224', 'Technology', 3, 3);

INSERT INTO members (name, email, phone, address) VALUES
('Ravi Sharma', 'ravi@email.com', '9876543210', 'Mathura, UP'),
('Priya Patel', 'priya@email.com', '9123456789', 'Agra, UP'),
('Amit Kumar', 'amit@email.com', '9988776655', 'Delhi');
