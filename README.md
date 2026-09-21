
**ATM Transaction Simulator**

Team Number : Meghana
Roll Number :2620090142
Team member :Sai Harsha
Roll Number : 2620090143
Team Leader : Laxmi kanth Reddy 
Roll Number : 2620090061
Supervisor Name : Rakesh


## 1. Abstract

The **ATM Transaction Simulator** is a software application designed to simulate the basic operations performed through an Automated Teller Machine (ATM). The project provides users with a simple and interactive environment to perform common banking transactions without requiring a connection to a real banking system.

The system allows users to securely log in using an account number and Personal Identification Number (PIN). After successful authentication, users can perform operations such as **checking account balance, withdrawing cash, depositing money, transferring funds, changing their PIN, and viewing transaction history**. The system validates each transaction and updates the user's account information accordingly.

The main objective of this project is to demonstrate the working principles of an ATM and provide practical experience in concepts such as **user authentication, transaction processing, input validation, database management, and error handling**. The simulator can be developed using a programming language such as Java, Python, C++, or C#, with a database used to store account and transaction information.

The project provides a safe and controlled environment for understanding ATM functionality while demonstrating important software development concepts such as modular programming, security, data management, and user-friendly interface design.




## 2. Functional Requirements

### 2.1 User Authentication

* The system shall allow users to enter their **account number**.
* The system shall request a **PIN** for authentication.
* The system shall verify the entered credentials.
* The system shall deny access when invalid credentials are entered.
* The system should limit the number of unsuccessful PIN attempts.

### 2.2 Balance Inquiry

* The system shall allow authenticated users to check their current account balance.
* The available balance shall be displayed clearly to the user.

### 2.3 Cash Withdrawal

* The system shall allow users to enter the amount they want to withdraw.
* The system shall verify that sufficient account balance is available.
* The system shall verify that the requested amount is valid.
* The system shall deduct the withdrawn amount from the account balance.
* The system shall display a transaction confirmation.

### 2.4 Cash Deposit

* The system shall allow users to enter a deposit amount.
* The system shall validate the entered amount.
* The system shall add the deposited amount to the user's account balance.
* The system shall display the updated balance.

### 2.5 Fund Transfer

* The system shall allow users to transfer money to another account.
* The system shall request the destination account number and transfer amount.
* The system shall verify that the sender has sufficient funds.
* The system shall update the balances of the relevant accounts.
* The system shall record the transfer as a transaction.

### 2.6 PIN Management

* The system shall allow authenticated users to change their PIN.
* The system shall request confirmation of the new PIN.
* The system shall update the PIN only when the required validation is successful.

### 2.7 Transaction History

* The system shall record completed transactions.
* The user shall be able to view recent transactions.
* Each transaction should contain information such as:

  * Transaction type
  * Amount
  * Date and time
  * Account balance after the transaction

### 2.8 Receipt/Transaction Confirmation

* The system should provide a transaction confirmation after successful operations.
* The confirmation may be displayed on screen or generated as a simulated receipt.

### 2.9 Logout

* The system shall provide a logout option.
* After logout, the user's session shall be terminated.
* The next user shall be required to authenticate before accessing account information.

## 3. Non-Functional Requirements

### 3.1 Security

* User PINs should not be displayed while being entered.
* Account information should only be accessible after successful authentication.
* The system should prevent unauthorized access to other users' accounts.

### 3.2 Performance

* Transactions should be processed quickly.
* The system should respond to user actions without unnecessary delays.

### 3.3 Reliability

* Account balances must be updated correctly after every successful transaction.
* Failed transactions should not incorrectly modify account balances.
* Transaction records should remain consistent.

### 3.4 Usability

* The interface should be simple and easy to understand.
* Menus should clearly display available operations.
* Appropriate messages should be displayed for invalid inputs and failed transactions.

### 3.5 Maintainability

* The application should be divided into separate modules such as authentication, account management, transactions, and database management.
* The source code should be properly documented and organized.

## 4. Hardware Requirements

The minimum hardware requirements are:

* Processor: Dual-core processor or better
* RAM: 4 GB or more
* Storage: At least 500 MB of free space
* Keyboard and monitor/display
* Optional printer for simulated receipts

## 5. Software Requirements

Depending on the implementation, the project may require:

* Operating System: Windows, Linux, or macOS
* Programming Language: Java / Python / C++ / C#
* Database: MySQL / SQLite / PostgreSQL
* IDE: Visual Studio Code / IntelliJ IDEA / Eclipse / PyCharm
* Database connectivity library or framework

## 6. Database Requirements

The system should maintain information such as:

### Account Table

* Account ID
* Account Number
* Customer Name
* PIN
* Account Balance
* Account Status

### Transaction Table

* Transaction ID
* Account Number
* Transaction Type
* Amount
* Transaction Date and Time
* Balance After Transaction
* Destination Account, where applicable

## 7. System Constraints

* The simulator does not need to connect to an actual bank network.
* Transactions are performed only on simulated accounts.
* Cash availability can be simulated rather than connected to a physical ATM cash dispenser.
* The system should reject invalid or insufficient transactions.
* Only registered users can access banking operations.

## 8. Expected Outcome

The completed ATM Transaction Simulator should provide a functional simulation of an ATM, allowing authenticated users to perform basic banking transactions securely. The project should demonstrate accurate transaction processing, account management, authentication, database operations, and error handling.
