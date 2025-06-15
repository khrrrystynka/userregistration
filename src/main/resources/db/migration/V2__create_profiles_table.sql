CREATE TABLE profiles (
                          id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
                          full_name VARCHAR(255),
                          age INT,
                          user_id BIGINT UNIQUE,
                          CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id)
);
