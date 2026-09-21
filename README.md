# KLHB-FED-26-15-11-ATM-Transaction-Simulator

## ATM Transaction Simulator

An educational ATM simulation project for demonstrating authentication, account management, transaction processing, validation, transaction history, and software documentation.

## Mandatory repository structure

```
/
├── README.md
├── src/
├── docs/
├── data/
├── results/
└── reports/
```

Required top-level components:
- `src/`
- `docs/`
- `data/`
- `results/`
- `reports/`
- top-level `README.md`

## Project requirements

The simulator is intended to support authentication, limited failed login attempts, balance inquiry, withdrawal, deposit, fund transfer, PIN management, transaction history, transaction confirmation, logout/session termination, validation, and error handling.

## Data source

The `data/` directory contains synthetic demonstration data only. It is not connected to a real bank or financial service.

## Documentation

- Requirements: `docs/PROJECT_SPECIFICATION.md`
- Test plan: `docs/TEST_PLAN.md`
- Project report: `reports/PROJECT_REPORT.md`
- Evidence/results: `results/`

## Team information

Supervisor: Rakesh

Team:
- Meghana — Roll Number 2620090142
- Sai Harsha — Roll Number 2620090143
- Laxmi Kanth Reddy — Roll Number 2620090061

## Security note

The sample PINs in `data/accounts.csv` are dummy credentials for an educational simulator. Do not use real banking credentials or personal financial information.

## Status

The previous root-level web implementation has been removed. The repository has been reorganized around the mandatory academic project structure. Implementation belongs under `src/`, documentation under `docs/`, synthetic data under `data/`, evidence under `results/`, and reporting under `reports/`.
