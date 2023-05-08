        import java.util.ArrayList;
        import java.util.List;

         import java.util.logging.Level;
        import java.util.logging.Logger;
        public class Admin {

            Logger logger = Logger.getLogger(Admin.class.getName());

            protected List<Worker> findByNameWorker = new ArrayList<>();
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
                        logger.log(Level.INFO,"Worker is Exist");
                        return true;
                    }
                }
                logger.log(Level.INFO,"Worker will added to list");
                findByNameWorker.add(newWorker);
                return false;
            }

            public boolean searchWorker(int id){
                for(Worker existWorker : findByNameWorker){
                    if(existWorker.getId() == (id)){
                        logger.log(Level.INFO,"Exist");
                        return true;
                    }
                }
                logger.log(Level.INFO,"Not Exist");
                return false;
            }

            public boolean deleteWorker(int id){
                for(Worker existWorker : findByNameWorker){
                    if(existWorker.getId()== (id)){
                        logger.log(Level.INFO,"Exist");
                        findByNameWorker.removeIf(n -> (n.getId() == (id)));
                        return true;
                    }
                }
                logger.log(Level.INFO,"Not Exist");
                return false;
            }

            public boolean updateWorker(Worker toUpdate,int id){
                int neededIndex = 0;
                for(Worker worker : findByNameWorker) {
                    boolean temp = searchWorker(id);

                    if(temp){
                        neededIndex = findByNameWorker.indexOf(worker);

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

                String message1 = String.format("Total number of workers: %d",(actualNumberOfWorkers*100));
                String message2 = String.format("The number of Orders: %d",actualNumberOfOrders);
                String message3 = String.format("The number of bussy Worker: %d",(4*actualNumberOfOrders));
                String message4 = String.format("The number of available worker: %d",((actualNumberOfWorkers*100) - (4*actualNumberOfOrders)));
                logger.log(Level.INFO,message1);
                logger.log(Level.INFO,message2);
                logger.log(Level.INFO,message3);
                logger.log(Level.INFO,message4);



            }



        }
