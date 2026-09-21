# Test Plan

## Authentication
- Valid account + valid PIN → login succeeds.
- Invalid PIN → access denied.
- Repeated invalid PIN attempts → authentication is limited.
- Logout → protected dashboard is no longer accessible.

## Transactions
- Balance inquiry returns current balance.
- Valid withdrawal decreases balance.
- Withdrawal greater than balance is rejected without changing balance.
- Invalid/zero withdrawal is rejected.
- Valid deposit increases balance.
- Invalid deposit is rejected.
- Valid transfer decreases sender and increases receiver.
- Unknown destination account is rejected.
- Self-transfer is rejected.
- PIN change requires correct current PIN and matching new PIN.

## History
Every successful transaction records type, amount, timestamp, and balance after transaction.

## Security
PIN fields are masked and unauthenticated users cannot access account operations.