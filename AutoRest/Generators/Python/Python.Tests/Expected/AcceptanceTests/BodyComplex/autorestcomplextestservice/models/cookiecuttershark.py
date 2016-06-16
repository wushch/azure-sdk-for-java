# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from .shark import Shark


class Cookiecuttershark(Shark):
    """Cookiecuttershark.

    :param species:
    :type species: str
    :param length:
    :type length: float
    :param siblings:
    :type siblings: list of :class:`Fish
     <fixtures.acceptancetestsbodycomplex.models.Fish>`
    :param fishtype: Polymorphic Discriminator
    :type fishtype: str
    :param age:
    :type age: int
    :param birthday:
    :type birthday: datetime
    """ 

    _validation = {
        'length': {'required': True},
        'fishtype': {'required': True},
        'birthday': {'required': True},
    }

    def __init__(self, length, birthday, species=None, siblings=None, age=None):
        super(Cookiecuttershark, self).__init__(species=species, length=length, siblings=siblings, age=age, birthday=birthday)
        self.fishtype = 'cookiecuttershark'
