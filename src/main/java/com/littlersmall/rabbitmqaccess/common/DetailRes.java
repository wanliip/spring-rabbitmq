package com.littlersmall.rabbitmqaccess.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by littlersmall on 16/5/10.
 */
//统一返回值,可描述失败细节
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailRes {
  
    private boolean isSuccess;
    private String errMsg;

    public DetailRes(boolean b, String string) {
      this.isSuccess=b;
      this.errMsg=string;
    }
    public boolean isSuccess() {
      return isSuccess;
    }
    public void setSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
    }
    public String getErrMsg() {
      return errMsg;
    }
    public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
    }
    
    
}
