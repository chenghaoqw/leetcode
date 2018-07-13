import java.util.ArrayList;
import java.util.List;

public class Q401BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<Watch> list=new ArrayList<Watch>();
        for(int i=0;i<num;i++){
            if(list.size()==0){
                for(int index=0;index<10;index++){
                    Watch watch=new Watch();
                    watch=watch.append(index);
                    list.add(watch);
                }
            }else{
                List<Watch> list1=new ArrayList<Watch>();
                for(Watch item:list){
                    for(int index=0;index<10;index++){
                        if(index>item.i){
                            list1.add(item.append(index));
                        }
                    }
                }
                list=list1;
            }
        }
        List<String> r=new ArrayList();
        if(num==0){
            r.add("0:00");
        }
        for(Watch item:list){
            if(item.hour>=12 || item.min>=60) continue;
            r.add(String.format("%d:%02d", item.hour, item.min));
        }
        return r;
    }


    class Watch{
        public int hour=0;
        public int min=0;
        public int i=-1;
        public Watch(){
        }

        public Watch append(int index){
            if(index<=this.i) return null;
            Watch watch=new Watch();
            watch.hour=hour;
            watch.min=min;
            if(index<=3) watch.hour=this.hour+(int) Math.pow(2,index);
            else watch.min=this.min+(int) Math.pow(2,index-4);
            watch.i=index;
            return watch;
        }
    }
}