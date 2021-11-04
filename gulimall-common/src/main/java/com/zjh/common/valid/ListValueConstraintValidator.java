

package com.zjh.common.valid;

import java.util.HashSet;
import java.util.Set;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {
    private Set<Integer> set = new HashSet();

    public ListValueConstraintValidator() {
    }

    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();
        int[] var3 = vals;
        int var4 = vals.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int val = var3[var5];
            this.set.add(val);
        }

    }

    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return this.set.contains(value);
    }
}
