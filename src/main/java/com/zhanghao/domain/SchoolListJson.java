package com.zhanghao.domain;

import com.zhanghao.program1.SchoolSpecial;

import java.util.List;

/**
 * Created by Administrator on 2019/6/30/030.
 */
public class SchoolListJson {

    private String code;
    private String message;
    private SchoolListJsonData data;
    private String md5;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SchoolListJsonData getData() {
        return data;
    }

    public void setData(SchoolListJsonData data) {
        this.data = data;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public static void main(String[] args) {
        try {
            int flag = 1;
            int page=1;
            int size=20;
            double aaa=1001;
            while (flag!=0) {

                String url ="https://api.eol.cn/gkcx/api/?access_token=&admissions=&central=&department=&dual_class=" +
                    "&f211=&f985=&is_dual_class=&keyword=&page="+page+"&province_id=&request_type=1&school_type=" +
                    "&signsafe=&size="+size+"&sort=view_total&type=&uri=apigkcx/api/school/hotlists";



                SchoolSpecial ss = new SchoolSpecial();
                List<SchoolListJsonItem> list =ss.getScchoolList(url);
                for(SchoolListJsonItem a :list){
                    System.out.println(a);

                }
                //计算一次page
                if(flag==1){

                    page  = (int) Math.floor((double)ss.getNumFound_list() / size);
                }

                Thread.sleep(2000);
                System.out.println(flag);
                page = (int) Math.ceil(aaa / size);
                System.out.println(page);
                if(flag*20 == page*20){
                    break;
                }
                else {
                    flag++;
                }


        }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
