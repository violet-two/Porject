package ws.com.porject.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BeanData {


    @SerializedName("mainVideoUrl")
    private String mainVideoUrl;
    @SerializedName("givePointName")
    private String givePointName;
    @SerializedName("buyState")
    private String buyState;
    @SerializedName("givePoint")
    private String givePoint;
    @SerializedName("isDirectBuyProduct")
    private String isDirectBuyProduct;
    @SerializedName("channelType")
    private String channelType;
    @SerializedName("productName")
    private String productName;
    @SerializedName("merchantName")
    private String merchantName;
    @SerializedName("merchantId")
    private String merchantId;
    @SerializedName("pSellingPoint")
    private String pSellingPoint;
    @SerializedName("state")
    private String state;
    @SerializedName("isMobilePriceOnly")
    private Boolean isMobilePriceOnly;
    @SerializedName("stock")
    private Integer stock;
    @SerializedName("displayAttrs")
    private List<?> displayAttrs;
    @SerializedName("images")
    private List<String> images;
    @SerializedName("hasFav")
    private Boolean hasFav;
    @SerializedName("remarkCount")
    private Integer remarkCount;
    @SerializedName("totalExecTime")
    private String totalExecTime;
    @SerializedName("sellingPoint")
    private String sellingPoint;
    @SerializedName("sellableCount")
    private Integer sellableCount;
    @SerializedName("descVideoUrl")
    private String descVideoUrl;
    @SerializedName("isSpecialPrice")
    private Boolean isSpecialPrice;
    @SerializedName("baseMemberPrice")
    private String baseMemberPrice;
    @SerializedName("mSellingPoint")
    private String mSellingPoint;
    @SerializedName("minPrice")
    private String minPrice;
    @SerializedName("maxPrice")
    private String maxPrice;
    @SerializedName("isFastBuy")
    private String isFastBuy;
    @SerializedName("detailNoticeImageUrl")
    private String detailNoticeImageUrl;
    @SerializedName("averageScore")
    private Integer averageScore;
    @SerializedName("marketPriceName")
    private String marketPriceName;
    @SerializedName("specialPriceEndTime")
    private String specialPriceEndTime;
    @SerializedName("mobileContent")
    private String mobileContent;
    @SerializedName("isCanPublish")
    private Boolean isCanPublish;
    @SerializedName("mainVideoPreImageUrl")
    private String mainVideoPreImageUrl;
    @SerializedName("merchantType")
    private String merchantType;
    @SerializedName("relues")
    private ReluesBean relues;
    @SerializedName("onceMustBuyCount")
    private Integer onceMustBuyCount;
    @SerializedName("memberPrice")
    private String memberPrice;
    @SerializedName("upsAndDownFlag")
    private String upsAndDownFlag;
    @SerializedName("promotionLogo")
    private String promotionLogo;
    @SerializedName("lastCacheTime")
    private Long lastCacheTime;
    @SerializedName("totalBoughtNumber")
    private Integer totalBoughtNumber;
    @SerializedName("inventoryAttrs")
    private List<InventoryAttrsBean> inventoryAttrs;

    public String getMainVideoUrl() {
        return mainVideoUrl;
    }

    public void setMainVideoUrl(String mainVideoUrl) {
        this.mainVideoUrl = mainVideoUrl;
    }

    public String getGivePointName() {
        return givePointName;
    }

    public void setGivePointName(String givePointName) {
        this.givePointName = givePointName;
    }

    public String getBuyState() {
        return buyState;
    }

    public void setBuyState(String buyState) {
        this.buyState = buyState;
    }

    public String getGivePoint() {
        return givePoint;
    }

    public void setGivePoint(String givePoint) {
        this.givePoint = givePoint;
    }

    public String getIsDirectBuyProduct() {
        return isDirectBuyProduct;
    }

    public void setIsDirectBuyProduct(String isDirectBuyProduct) {
        this.isDirectBuyProduct = isDirectBuyProduct;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getPSellingPoint() {
        return pSellingPoint;
    }

    public void setPSellingPoint(String pSellingPoint) {
        this.pSellingPoint = pSellingPoint;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getIsMobilePriceOnly() {
        return isMobilePriceOnly;
    }

    public void setIsMobilePriceOnly(Boolean isMobilePriceOnly) {
        this.isMobilePriceOnly = isMobilePriceOnly;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<?> getDisplayAttrs() {
        return displayAttrs;
    }

    public void setDisplayAttrs(List<?> displayAttrs) {
        this.displayAttrs = displayAttrs;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Boolean getHasFav() {
        return hasFav;
    }

    public void setHasFav(Boolean hasFav) {
        this.hasFav = hasFav;
    }

    public Integer getRemarkCount() {
        return remarkCount;
    }

    public void setRemarkCount(Integer remarkCount) {
        this.remarkCount = remarkCount;
    }

    public String getTotalExecTime() {
        return totalExecTime;
    }

    public void setTotalExecTime(String totalExecTime) {
        this.totalExecTime = totalExecTime;
    }

    public String getSellingPoint() {
        return sellingPoint;
    }

    public void setSellingPoint(String sellingPoint) {
        this.sellingPoint = sellingPoint;
    }

    public Integer getSellableCount() {
        return sellableCount;
    }

    public void setSellableCount(Integer sellableCount) {
        this.sellableCount = sellableCount;
    }

    public String getDescVideoUrl() {
        return descVideoUrl;
    }

    public void setDescVideoUrl(String descVideoUrl) {
        this.descVideoUrl = descVideoUrl;
    }

    public Boolean getIsSpecialPrice() {
        return isSpecialPrice;
    }

    public void setIsSpecialPrice(Boolean isSpecialPrice) {
        this.isSpecialPrice = isSpecialPrice;
    }

    public String getBaseMemberPrice() {
        return baseMemberPrice;
    }

    public void setBaseMemberPrice(String baseMemberPrice) {
        this.baseMemberPrice = baseMemberPrice;
    }

    public String getMSellingPoint() {
        return mSellingPoint;
    }

    public void setMSellingPoint(String mSellingPoint) {
        this.mSellingPoint = mSellingPoint;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getIsFastBuy() {
        return isFastBuy;
    }

    public void setIsFastBuy(String isFastBuy) {
        this.isFastBuy = isFastBuy;
    }

    public String getDetailNoticeImageUrl() {
        return detailNoticeImageUrl;
    }

    public void setDetailNoticeImageUrl(String detailNoticeImageUrl) {
        this.detailNoticeImageUrl = detailNoticeImageUrl;
    }

    public Integer getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Integer averageScore) {
        this.averageScore = averageScore;
    }

    public String getMarketPriceName() {
        return marketPriceName;
    }

    public void setMarketPriceName(String marketPriceName) {
        this.marketPriceName = marketPriceName;
    }

    public String getSpecialPriceEndTime() {
        return specialPriceEndTime;
    }

    public void setSpecialPriceEndTime(String specialPriceEndTime) {
        this.specialPriceEndTime = specialPriceEndTime;
    }

    public String getMobileContent() {
        return mobileContent;
    }

    public void setMobileContent(String mobileContent) {
        this.mobileContent = mobileContent;
    }

    public Boolean getIsCanPublish() {
        return isCanPublish;
    }

    public void setIsCanPublish(Boolean isCanPublish) {
        this.isCanPublish = isCanPublish;
    }

    public String getMainVideoPreImageUrl() {
        return mainVideoPreImageUrl;
    }

    public void setMainVideoPreImageUrl(String mainVideoPreImageUrl) {
        this.mainVideoPreImageUrl = mainVideoPreImageUrl;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public ReluesBean getRelues() {
        return relues;
    }

    public void setRelues(ReluesBean relues) {
        this.relues = relues;
    }

    public Integer getOnceMustBuyCount() {
        return onceMustBuyCount;
    }

    public void setOnceMustBuyCount(Integer onceMustBuyCount) {
        this.onceMustBuyCount = onceMustBuyCount;
    }

    public String getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(String memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getUpsAndDownFlag() {
        return upsAndDownFlag;
    }

    public void setUpsAndDownFlag(String upsAndDownFlag) {
        this.upsAndDownFlag = upsAndDownFlag;
    }

    public String getPromotionLogo() {
        return promotionLogo;
    }

    public void setPromotionLogo(String promotionLogo) {
        this.promotionLogo = promotionLogo;
    }

    public Long getLastCacheTime() {
        return lastCacheTime;
    }

    public void setLastCacheTime(Long lastCacheTime) {
        this.lastCacheTime = lastCacheTime;
    }

    public Integer getTotalBoughtNumber() {
        return totalBoughtNumber;
    }

    public void setTotalBoughtNumber(Integer totalBoughtNumber) {
        this.totalBoughtNumber = totalBoughtNumber;
    }

    public List<InventoryAttrsBean> getInventoryAttrs() {
        return inventoryAttrs;
    }

    public void setInventoryAttrs(List<InventoryAttrsBean> inventoryAttrs) {
        this.inventoryAttrs = inventoryAttrs;
    }

    public static class ReluesBean {
        @SerializedName("gift")
        private List<?> gift;
        @SerializedName("coupon")
        private List<CouponBean> coupon;
        @SerializedName("exchange")
        private List<?> exchange;
        @SerializedName("moreCoupon")
        private List<?> moreCoupon;

        public List<?> getGift() {
            return gift;
        }

        public void setGift(List<?> gift) {
            this.gift = gift;
        }

        public List<CouponBean> getCoupon() {
            return coupon;
        }

        public void setCoupon(List<CouponBean> coupon) {
            this.coupon = coupon;
        }

        public List<?> getExchange() {
            return exchange;
        }

        public void setExchange(List<?> exchange) {
            this.exchange = exchange;
        }

        public List<?> getMoreCoupon() {
            return moreCoupon;
        }

        public void setMoreCoupon(List<?> moreCoupon) {
            this.moreCoupon = moreCoupon;
        }

        public static class CouponBean {
            @SerializedName("lastModifiedTime")
            private Long lastModifiedTime;
            @SerializedName("endDate")
            private Long endDate;
            @SerializedName("description")
            private String description;
            @SerializedName("recommend")
            private String recommend;
            @SerializedName("type")
            private String type;
            @SerializedName("displayInProductDetail")
            private Boolean displayInProductDetail;
            @SerializedName("enabled")
            private Boolean enabled;
            @SerializedName("tips")
            private String tips;
            @SerializedName("vid")
            private String vid;
            @SerializedName("highTimes")
            private Integer highTimes;
            @SerializedName("scope")
            private List<?> scope;
            @SerializedName("id")
            private String id;
            @SerializedName("minCost")
            private Integer minCost;
            @SerializedName("productRule")
            private Boolean productRule;
            @SerializedName("specialPricedProductOk")
            private Boolean specialPricedProductOk;
            @SerializedName("excludeOtherOrderRule")
            private Boolean excludeOtherOrderRule;
            @SerializedName("includedCategories")
            private List<List<IncludedCategoriesBean>> includedCategories;
            @SerializedName("includedUserCollections")
            private List<?> includedUserCollections;
            @SerializedName("combinedProductOk")
            private Boolean combinedProductOk;
            @SerializedName("includedProducts")
            private List<?> includedProducts;
            @SerializedName("priority")
            private Integer priority;
            @SerializedName("beginDate")
            private Long beginDate;
            @SerializedName("name")
            private String name;
            @SerializedName("excludedProducts")
            private List<?> excludedProducts;
            @SerializedName("excludedCategories")
            private List<?> excludedCategories;
            @SerializedName("includedUserGroups")
            private List<?> includedUserGroups;

            public Long getLastModifiedTime() {
                return lastModifiedTime;
            }

            public void setLastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
            }

            public Long getEndDate() {
                return endDate;
            }

            public void setEndDate(Long endDate) {
                this.endDate = endDate;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getRecommend() {
                return recommend;
            }

            public void setRecommend(String recommend) {
                this.recommend = recommend;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Boolean getDisplayInProductDetail() {
                return displayInProductDetail;
            }

            public void setDisplayInProductDetail(Boolean displayInProductDetail) {
                this.displayInProductDetail = displayInProductDetail;
            }

            public Boolean getEnabled() {
                return enabled;
            }

            public void setEnabled(Boolean enabled) {
                this.enabled = enabled;
            }

            public String getTips() {
                return tips;
            }

            public void setTips(String tips) {
                this.tips = tips;
            }

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public Integer getHighTimes() {
                return highTimes;
            }

            public void setHighTimes(Integer highTimes) {
                this.highTimes = highTimes;
            }

            public List<?> getScope() {
                return scope;
            }

            public void setScope(List<?> scope) {
                this.scope = scope;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public Integer getMinCost() {
                return minCost;
            }

            public void setMinCost(Integer minCost) {
                this.minCost = minCost;
            }

            public Boolean getProductRule() {
                return productRule;
            }

            public void setProductRule(Boolean productRule) {
                this.productRule = productRule;
            }

            public Boolean getSpecialPricedProductOk() {
                return specialPricedProductOk;
            }

            public void setSpecialPricedProductOk(Boolean specialPricedProductOk) {
                this.specialPricedProductOk = specialPricedProductOk;
            }

            public Boolean getExcludeOtherOrderRule() {
                return excludeOtherOrderRule;
            }

            public void setExcludeOtherOrderRule(Boolean excludeOtherOrderRule) {
                this.excludeOtherOrderRule = excludeOtherOrderRule;
            }

            public List<List<IncludedCategoriesBean>> getIncludedCategories() {
                return includedCategories;
            }

            public void setIncludedCategories(List<List<IncludedCategoriesBean>> includedCategories) {
                this.includedCategories = includedCategories;
            }

            public List<?> getIncludedUserCollections() {
                return includedUserCollections;
            }

            public void setIncludedUserCollections(List<?> includedUserCollections) {
                this.includedUserCollections = includedUserCollections;
            }

            public Boolean getCombinedProductOk() {
                return combinedProductOk;
            }

            public void setCombinedProductOk(Boolean combinedProductOk) {
                this.combinedProductOk = combinedProductOk;
            }

            public List<?> getIncludedProducts() {
                return includedProducts;
            }

            public void setIncludedProducts(List<?> includedProducts) {
                this.includedProducts = includedProducts;
            }

            public Integer getPriority() {
                return priority;
            }

            public void setPriority(Integer priority) {
                this.priority = priority;
            }

            public Long getBeginDate() {
                return beginDate;
            }

            public void setBeginDate(Long beginDate) {
                this.beginDate = beginDate;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<?> getExcludedProducts() {
                return excludedProducts;
            }

            public void setExcludedProducts(List<?> excludedProducts) {
                this.excludedProducts = excludedProducts;
            }

            public List<?> getExcludedCategories() {
                return excludedCategories;
            }

            public void setExcludedCategories(List<?> excludedCategories) {
                this.excludedCategories = excludedCategories;
            }

            public List<?> getIncludedUserGroups() {
                return includedUserGroups;
            }

            public void setIncludedUserGroups(List<?> includedUserGroups) {
                this.includedUserGroups = includedUserGroups;
            }

            public static class IncludedCategoriesBean {
                @SerializedName("name")
                private String name;
                @SerializedName("id")
                private String id;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }
            }
        }
    }

    public static class InventoryAttrsBean {
        @SerializedName("name")
        private String name;
        @SerializedName("id")
        private String id;
        @SerializedName("standardValues")
        private List<StandardValuesBean> standardValues;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<StandardValuesBean> getStandardValues() {
            return standardValues;
        }

        public void setStandardValues(List<StandardValuesBean> standardValues) {
            this.standardValues = standardValues;
        }

        public static class StandardValuesBean {
            @SerializedName("name")
            private String name;
            @SerializedName("id")
            private String id;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }
}
