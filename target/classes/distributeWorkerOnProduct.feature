# our industry can fill with 200 workers , minimum number to make industry work is 100 worker
# Let each order need 4 worker to treatment with it , if we have 150 worker , and we have 30 order  -->> 30 * 4 = 120
# Then there is 30 worker available to treatment with new order 30/4  --> we can treatment with another 7 orders

  Feature: Distribute orders on workers
        Scenario Outline: have enough workers
          When have enough worker
          Then divide <numberOfWorker> on <numberOfOrder> <workerNeeded> <workerAvailable>

          Examples:
          |numberOfWorker| numberOfOrder|workerNeeded|workerAvailable|
          |120           |24            | 96         |    24         |
