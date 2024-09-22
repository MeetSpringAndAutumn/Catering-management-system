package com.lzy.shan.restaurant.controller.sysController;

import com.lzy.shan.restaurant.entity.CustomPageInfo;
import com.lzy.shan.restaurant.entity.Member;
import com.lzy.shan.restaurant.entity.Order;
import com.lzy.shan.restaurant.entity.Result;
import com.lzy.shan.restaurant.service.OrderService;
import com.lzy.shan.restaurant.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sold")
public class SoldManageController {
    @Autowired
    private OrderService orderService;

    /**
     * 交易记录列表HTML页面
     * @return
     */
    @GetMapping("/tranRecordsList.html")
    public String transactionRecordsList(){
        return "sold/transactionRecordsList";
    }

    /**
     * 交易记录列表数据接口
     * @param pageInfo
     * @param order
     * @return
     */
    @PostMapping("/tranRecordsList.do")
    @ResponseBody
    public Result<Order> orderList(CustomPageInfo<Order> pageInfo, Order order, Member member){
        //交易记录是已支付订单，状态为1
        order.setPayStatus(1);
        order.setMember(member);
        pageInfo.setT(order);
        //按时间降序
        pageInfo.setOrderBy("DESC");
        CustomPageInfo<Order> resultInfo =  orderService.findPage(pageInfo);
        return ResultUtil.success(resultInfo.getList(),resultInfo.getTotal());
    }
}
