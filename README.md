# API CP Crime Court Hearing Cases

The Court Hearing Cases API provides details of a criminal case. 

This RESTful API provides **read-only access** to a hierarchical structure of legal case data, including:

- **Cases**
  - **Results** (general outcomes of the case)
  - **Defendants** (individuals or entities involved)
    - **Results** (specific to each defendant)
    - **Offences** (charges brought against the defendant)
      - **Results** (outcomes related to each offence)

The hierarchy reflects how legal data is typically organized, allowing consumers to traverse from a high-level case down to detailed offence-level results.

All endpoints are **read-only** (`GET` requests only), making this API ideal for applications that need to **view, analyze, or report on legal case information**.


## License

This project is licensed under the [MIT License](LICENSE).
