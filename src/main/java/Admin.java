        import java.util.ArrayList;
        import java.util.List;
        public class Admin {
            public List<Worker> findByNameWorker = new ArrayList<>();
            private String email ;
            private String password;


            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }
            ////////////////////////////////////////// methods

            public boolean addWorker(Worker newWorker){
                for(Worker oldWorker : findByNameWorker){
                    if(oldWorker.getId()==(newWorker.getId())){
                        System.out.println("Worker is Exist");
                        return true;
                    }
                }
                System.out.println("Worker will added to list");
                findByNameWorker.add(newWorker);
                return false;
            }

            public boolean searchWorker(int id){
                for(Worker existWorker : findByNameWorker){
                    if(existWorker.getId() == (id)){
                        System.out.println("Exist");
                        return true;
                    }
                }
                System.out.println("Not Exist");
                return false;
            }

            public boolean deleteWorker(int id){
                for(Worker existWorker : findByNameWorker){
                    if(existWorker.getId()== (id)){
                        System.out.println("Exist");
                        findByNameWorker.removeIf(n -> (n.getId() == (id)));
                        return true;
                    }
                }
                System.out.println("Not Exist");
                return false;
            }

            public boolean updateWorker(Worker toUpdate,int id){
                int neededIndex = 0;
                for(Worker worker : findByNameWorker) {
                    boolean temp = searchWorker(id);
                    System.out.println(temp);
                    if(temp){
                        neededIndex = findByNameWorker.indexOf(worker);
                        System.out.println(findByNameWorker.indexOf(worker));
                        return  true;
                    }

                }
                findByNameWorker.set(neededIndex-1,toUpdate);
                return false;
            }

            // 2) Feature to Distribute Workers on products
            public void distributeWorkerOnProducts(int actualNumberOfOrders){

                int actualNumberOfWorkers = 0 ;
                for(int i = 0 ; i < findByNameWorker.size(); i++){
                    actualNumberOfWorkers++;
                }

                // multiply of 100 instead of write information for 100 workers
                System.out.println("Total number of workers: "+(actualNumberOfWorkers*100));
                System.out.println("The number of Orders: "+actualNumberOfOrders);
                System.out.println("The number of bussy Worker: "+(4*actualNumberOfOrders));
                System.out.println("The number of available worker: "+((actualNumberOfWorkers*100) - (4*actualNumberOfOrders)));
            }



        }
