/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v0.services.stub;

import com.google.ads.googleads.v0.resources.CampaignBudget;
import com.google.ads.googleads.v0.services.GetCampaignBudgetRequest;
import com.google.ads.googleads.v0.services.MutateCampaignBudgetsRequest;
import com.google.ads.googleads.v0.services.MutateCampaignBudgetsResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class CampaignBudgetServiceStub implements BackgroundResource {

  public UnaryCallable<GetCampaignBudgetRequest, CampaignBudget> getCampaignBudgetCallable() {
    throw new UnsupportedOperationException("Not implemented: getCampaignBudgetCallable()");
  }

  public UnaryCallable<MutateCampaignBudgetsRequest, MutateCampaignBudgetsResponse>
      mutateCampaignBudgetsCallable() {
    throw new UnsupportedOperationException("Not implemented: mutateCampaignBudgetsCallable()");
  }

  @Override
  public abstract void close();
}