# ATM Transaction Simulator — Project Specification

## Objective
Build an educational ATM simulator that demonstrates authentication, account management, transaction processing, validation, security concepts, and transaction records.

## Functional requirements
1. Account-number and PIN authentication.
2. Limit unsuccessful PIN attempts.
3. Balance inquiry.
4. Cash withdrawal with amount and balance validation.
5. Cash deposit with amount validation.
6. Fund transfer to another registered account.
7. PIN change with confirmation.
8. Transaction history containing type, amount, timestamp, and resulting balance.
9. Transaction confirmation/receipt.
10. Logout and session termination.

## Non-functional requirements
- Clear and usable interface.
- Modular, maintainable source code.
- Correct balance updates.
- Failed transactions must not alter balances.
- PIN input should be masked.
- Only authenticated users can access account operations.
- No connection to a real banking network.

## Required repository layout
```
/
├── README.md
├── src/
├── docs/
├── data/
├── results/
└── reports/
```

## Data
The simulator uses local/project data only. No real banking data or credentials should be used.

## Evidence
Results and reports must document testing, transaction scenarios, and project outcomes.