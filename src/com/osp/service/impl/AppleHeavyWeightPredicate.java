package com.osp.service.impl;

import com.osp.service.ApplePredicate;
import data.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>10;
    }
}
