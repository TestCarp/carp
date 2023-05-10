Feature: Distribute workers on products
        Scenario Outline: have enough workers
          When have enough worker
          Then divide <numberOfWorker> on <numberOfOrder> <workerNeeded> <workerAvailable>

          Examples:
          |numberOfWorker| numberOfOrder|workerNeeded|workerAvailable|
          |120           |24            | 96         |    24         |
